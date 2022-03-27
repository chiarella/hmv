package br.com.hmv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hmv.entity.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long>{

}
