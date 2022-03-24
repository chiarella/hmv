package br.com.hmv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hmv.entity.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
