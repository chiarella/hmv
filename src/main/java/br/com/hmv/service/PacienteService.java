package br.com.hmv.service;


import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.hmv.dto.PacienteDTO;


@Service
@Transactional
public interface PacienteService {

	String save(PacienteDTO pacienteDTO, HttpStatus ok) throws IOException;
	
	List<PacienteDTO> getAll();
	
	PacienteDTO findById(Long id);

	void update(Long id, PacienteDTO pacienteDto);
	
	void delete(Long id);

	Object findByCpf(String cpf);

	Object findImageByCpf(String cpf);
	


}
