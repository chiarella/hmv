package br.com.hmv.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hmv.dto.AgendaDTO;
import br.com.hmv.entity.Agenda;
import br.com.hmv.entity.Paciente;
import br.com.hmv.mapper.AgendaMapperManual;
import br.com.hmv.repository.AgendaRepository;
import br.com.hmv.repository.PacienteRepository;
import br.com.hmv.service.AgendaService;


@Service
@Transactional
public class AgendaServiceImpl implements AgendaService {
	
	
	@Autowired 
	private AgendaRepository repository;
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Autowired
	private AgendaMapperManual mapper;

	@Override
	public String save(AgendaDTO agendaDTO) {
		Paciente paciente = pacienteRepository
				.findByIdpaciente(agendaDTO.getIdPaciente());
		agendaDTO.setIdPaciente(paciente.getId());
		
		Agenda agenda = mapper.agendaDtoToAgendaDomain(agendaDTO);
		agenda.setPaciente(paciente);
		
		repository.save(agenda);
		
		return "Cadastrado";
	}

	@Override
	public List<AgendaDTO> getAll() {
		List<Agenda> agenda = repository.findAll();
		return mapper.listAgendaDomainToListAgendaDto(agenda);
	}

	@Override
	public AgendaDTO findById(Long id) {
		Optional<Agenda> agenda = repository.findById(id);
		return mapper.agendaDomainToAgendaDto(agenda.get());
	}
	
	

}
