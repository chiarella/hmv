package br.com.hmv.service.impl;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import br.com.hmv.dto.PacienteDTO;
import br.com.hmv.entity.Paciente;
import br.com.hmv.mapper.PacienteMapperManual;
import br.com.hmv.repository.PacienteRepository;
import br.com.hmv.service.PacienteService;

@Service
@Transactional
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteRepository repository;

	@Autowired
	private PacienteMapperManual mapper;

	private static final String QR_CODE_IMAGE_PATH = "C:\\WorkspaceJava\\hmv\\";
	private static final String TIPO_DE_ARQUIVO = ".jpg";
	

	@Override
	public String save(PacienteDTO pacienteDTO) {
		
//		List<String> text = new ArrayList<String>();
//		text.add("Test 1");
//		try {
//			generateQRCodeImage(text, 350, 350, QR_CODE_IMAGE_PATH, pacienteDTO.getCpf());
//		} catch (WriterException | IOException e) {
//			e.printStackTrace();
//		}
//		File file = new File("C:\\WorkspaceJava\\hmv\\" + pacienteDTO.getCpf() + TIPO_DE_ARQUIVO);
//		byte[] bFile = new byte[(int) file.length()];
//		FileInputStream fileInputStream = new FileInputStream(file);
//		fileInputStream.read(bFile);
//		fileInputStream.close();
		
		Paciente paciente = mapper.pacienteDtoToPacienteDomain(pacienteDTO);
		//paciente = repository.save(paciente);
		repository.save(paciente);
		return "ok";
	}

	@Override
	public List<PacienteDTO> getAll() {
		List<Paciente> paciente = repository.findAll();
		return mapper.listPacienteDomainToListPacienteDto(paciente);
	}

	@Override
	public PacienteDTO findById(Long id) {
		Optional<Paciente> paciente = repository.findById(id);
		return mapper.pacienteDomainToPacienteDto(paciente.get());
	}
	
	@Override
	public Object findByCpf(String cpf) {
		Optional<Paciente> paciente = repository.findByCpf(cpf);
		return mapper.pacienteDomainToPacienteDto(paciente.get());
	}

	@Override
	public Object findImageByCpf(String cpf) {
		Optional<Paciente> paciente = repository.findImageByCpf(cpf);
		return mapper.pacienteDomainToPacienteDto(paciente.get());
	}

	
	@Override
	public void update(Long id, PacienteDTO pacienteDto) {
		pacienteDto.setId(id);
		Paciente paciente = mapper.pacienteDtoToPacienteDomain(pacienteDto);
		repository.save(paciente);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);

	}

	private static void generateQRCodeImage(List<String> text, 
			int width, int height, String filePath, String cpf)
			throws WriterException, IOException {
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		String str = "";
		for (String string : text) {
			str += string += " : ";
		}
		BitMatrix bitMatrix = qrCodeWriter.encode(str.toString(), BarcodeFormat.QR_CODE, width, height);
		java.nio.file.Path path = FileSystems.getDefault().getPath(filePath + cpf + TIPO_DE_ARQUIVO);
		MatrixToImageWriter.writeToPath(bitMatrix, "jpg", path);

	}

}
