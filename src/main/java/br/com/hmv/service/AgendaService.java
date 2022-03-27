package br.com.hmv.service;

import java.util.List;

import br.com.hmv.dto.AgendaDTO;

public interface AgendaService {
	
	String save(AgendaDTO agendaDTO);
	
	List<AgendaDTO> getAll();

	AgendaDTO findById(Long id);

}
