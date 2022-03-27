package br.com.hmv.controller;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import br.com.hmv.dto.PacienteDTO;
import br.com.hmv.dto.PacienteRetornoQuizDTO;
import br.com.hmv.entity.Paciente;
import br.com.hmv.mapper.PacienteMapperManualQuiz;
import br.com.hmv.repository.PacienteRepository;
import br.com.hmv.service.PacienteService;

@RestController
@RequestMapping("/api/v1/paciente")
public class PacienteController {

	private static String url = "http://localhost:9090/hmv/api/v1/paciente/findById/";

	@Autowired
	private PacienteService service;

	@Autowired
	private PacienteRepository repository;

	@Autowired
	private PacienteMapperManualQuiz mapperQuiz;
	

	/*
	 * END POINT - OK http://localhost:9090/hmv/api/v1/paciente/generateQRCode?id=1
	 * retorna http://localhost:9090/hmv/api/v1/paciente/findById/1
	 */
	@GetMapping(value = "/generateQRCode", produces = MediaType.IMAGE_PNG_VALUE)
	public BufferedImage generateQRCodeWhitId(@RequestParam String id) throws Exception {

		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		BitMatrix bitMatrix = qrCodeWriter.encode(url + id, BarcodeFormat.QR_CODE, 250, 250);
		return MatrixToImageWriter.toBufferedImage(bitMatrix);
	}

	/*
	 * END POINT - OK
	 * http://localhost:9090/hmv/api/v1/paciente/generateQRCodeReturnList?id=1
	 * retorna QR CODE ao ler em outro celular aparece uma lista customizada
	 * PacienteRetornoQuizDTO
	 */
	@GetMapping(value = "/generateQRCodeReturnList", produces = MediaType.IMAGE_PNG_VALUE)
	public BufferedImage generateQRCodeWhitIdRetunrListBD(@RequestParam Long id) throws Exception {
		QRCodeWriter qrCodeWriter = new QRCodeWriter();

		Optional<Paciente> listDTO = repository.findById(id);
		PacienteRetornoQuizDTO lista = mapperQuiz.pacienteDomainToPacienteDto(listDTO.get());
		BitMatrix bitMatrix = qrCodeWriter.encode(lista.toString(), BarcodeFormat.QR_CODE, 250, 250);
		return MatrixToImageWriter.toBufferedImage(bitMatrix);
	}


	/*
	 * END POINT - OK
	 * http://localhost:9090/hmv/api/v1/paciente/getqrcode?url=https://start.spring.io/
	 * retorna QR CODE com a String de uma URL recebida no endpoint
	 * string recebida = https://start.spring.io/
	 */
	@GetMapping(value = "/getqrcode", produces = MediaType.IMAGE_PNG_VALUE)
	public BufferedImage generateQRCodeImage(@RequestParam String url) throws Exception {
		// QRcode generator logic
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		BitMatrix bitMatrix = qrCodeWriter.encode(url, BarcodeFormat.QR_CODE, 250, 250);
		return MatrixToImageWriter.toBufferedImage(bitMatrix);
	}

	/*
	 * END POINT - OK
	 * http://localhost:9090/hmv/api/v1/paciente/getqrcode2
	 * retorna QR CODE com a String de uma URL fiza dentro do metodo
	 * string FIXA = https://start.spring.io/
	 */
	@GetMapping(value = "/getqrcode2", produces = MediaType.IMAGE_PNG_VALUE)
	public BufferedImage generateQRCodeImage5() throws Exception {
		String url = "https://start.spring.io/";
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		BitMatrix bitMatrix = qrCodeWriter.encode(url, BarcodeFormat.QR_CODE, 250, 250);
		return MatrixToImageWriter.toBufferedImage(bitMatrix);
	}
	
	/*
	 * END POINT - OK
	 * http://localhost:9090/hmv/api/v1/paciente/getqrcode3/32010473841
	 * retorna QR CODE com uma lista referente aos dados do cliente
	 * pesquisa no banco feita pelo CPF
	 */
	@GetMapping(value = "/getqrcode3/{cpf}", produces = MediaType.IMAGE_PNG_VALUE)
	public BufferedImage generateQRCodeImage3(@PathVariable(value = "cpf") String cpf) throws Exception {
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		Optional<Paciente> listDTO = repository.findByCpf(cpf);
		PacienteRetornoQuizDTO lista = mapperQuiz.pacienteDomainToPacienteDto(listDTO.get());
		BitMatrix bitMatrix = qrCodeWriter.encode(lista.toString(), BarcodeFormat.QR_CODE, 250, 250);
		return MatrixToImageWriter.toBufferedImage(bitMatrix);
	}


	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody PacienteDTO pacienteDTO) {
		return new ResponseEntity<>(service.save(pacienteDTO), HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<PacienteDTO>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}

	@GetMapping("/findById/{id}")
	public ResponseEntity<PacienteDTO> findById(@PathVariable(value = "id") Long id) {
		return ResponseEntity.ok(service.findById(id));
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable(value = "id") Long id, @RequestBody PacienteDTO pacienteDto) {
		service.update(id, pacienteDto);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/findByCpf/{cpf}")
	public ResponseEntity<Object> findByCpf(@PathVariable(value = "cpf") String cpf) {
		return ResponseEntity.ok(service.findByCpf(cpf));
	}

}
