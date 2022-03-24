package br.com.hmv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hmv.entity.Doenca;

@Repository
public interface DoencaRepository extends JpaRepository<Doenca, Long>{

}
