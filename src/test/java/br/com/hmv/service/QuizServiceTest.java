package br.com.hmv.service;

import org.junit.Assert;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.hmv.controller.PacienteController;
import br.com.hmv.controller.QuizController;
import br.com.hmv.dto.PacienteDTO;
import br.com.hmv.dto.QuizDTO;
import br.com.hmv.entity.Paciente;
import br.com.hmv.entity.Quiz;
import br.com.hmv.mapper.PacienteMapperManual;
import br.com.hmv.mapper.QuizMapperManual;
import br.com.hmv.repository.PacienteRepository;
import br.com.hmv.repository.QuizRepository;
import br.com.hmv.service.impl.PacienteServiceImpl;
import br.com.hmv.service.impl.QuizServiceImpl;

@ExtendWith(MockitoExtension.class) 
public class QuizServiceTest {
	
	@Mock
	private PacienteMapperManual mapper;
	
	@Mock
	private PacienteRepository repository;
	
	@Mock
	private PacienteController controller;
	
	@InjectMocks
	private PacienteServiceImpl service;
	
	
	@Mock
	private QuizMapperManual mapperQuiz;
	
	@Mock
	private QuizRepository repositoryQuiz;
	
	@Mock
	private QuizController controllerQuiz;
	
	@InjectMocks
	private QuizServiceImpl serviceQuiz;
	
	@Test
	@Order(1)
	void cadastrarPaciente() {
		
		Paciente paciente = new Paciente();
		paciente.setId(1L);
		PacienteDTO dto = new PacienteDTO();
		Mockito.when(repository.save(Mockito.any())).thenReturn(paciente);
		Assert.assertNotNull(service.save(dto));
		
	}
	
	@Test
	@Order(2)
	void cadastrarQuizServiceTest() {
		
		Paciente paciente = new Paciente();
		paciente.setId(1L);
		PacienteDTO dto = new PacienteDTO();
		dto.setId(1L);
		Mockito.when(repository.save(Mockito.any())).thenReturn(paciente);
		Assert.assertNotNull(service.save(dto));
		
		Quiz quiz = new Quiz();
		quiz.setPaciente(paciente);
		QuizDTO dtoQuiz = new QuizDTO();
		dto.setIdadePaciente(1);
		Mockito.when(repositoryQuiz.save(Mockito.any())).thenReturn(quiz);
		Assert.assertNotNull(serviceQuiz.save(dtoQuiz));
	}
		

}
