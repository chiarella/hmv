package br.com.hmv.controller;

import java.awt.image.BufferedImage;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import br.com.hmv.dto.QuizDTO;
import br.com.hmv.service.QuizService;

@RestController
@RequestMapping("/api/v1/quiz")
public class QuizController {
	
	@Autowired
	private QuizService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody QuizDTO quizDTO) {
			return new ResponseEntity<>(service.save(quizDTO), HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<QuizDTO>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<QuizDTO> findById(@PathVariable(value = "id")Long id) {
		return ResponseEntity.ok(service.findById(id));
	}
	
	@GetMapping("/findQRCodeById/{id}")
	public BufferedImage generrateQRCode(@RequestParam Long id) throws WriterException {
		
		service.findById(id);
		String url = "https://www.terra.com.br/";
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		BitMatrix bitMatrix = qrCodeWriter.encode(url, BarcodeFormat.QR_CODE, 250, 250);
		return MatrixToImageWriter.toBufferedImage(bitMatrix);
	}

	
}
