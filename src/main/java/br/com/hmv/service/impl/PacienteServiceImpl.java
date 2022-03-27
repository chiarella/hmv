package br.com.hmv.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	@Override
	public String save(PacienteDTO pacienteDTO) {

		Paciente paciente = mapper.pacienteDtoToPacienteDomain(pacienteDTO);
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

}
