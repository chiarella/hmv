package br.com.hmv.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.hmv.dto.PacienteDTO;
import br.com.hmv.entity.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

	void save(PacienteDTO pacienteDTO);

	Optional<Paciente> findByCpf(String cpf);
	
	Optional<Paciente> findImageByCpf(String cpf);
	
	@Query("Select m from Paciente m WHERE m.id = :id ")
	Paciente findByIdpaciente(Long id);
	

}
