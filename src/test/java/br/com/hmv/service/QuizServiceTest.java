package br.com.hmv.service;

import java.util.List;
import java.util.Optional;

import junit.framework.Assert;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.hmv.controller.QuizController;
import br.com.hmv.dto.QuizDTO;
import br.com.hmv.entity.Quiz;
import br.com.hmv.mapper.QuizMapperManual;
import br.com.hmv.repository.QuizRepository;
import br.com.hmv.service.impl.QuizServiceImpl;

@ExtendWith(MockitoExtension.class)
public class QuizServiceTest {

	@Mock
	private QuizMapperManual mapperQuiz;

	@Mock
	private QuizRepository repositoryQuiz;

	@Mock
	private QuizController controllerQuiz;

	@InjectMocks
	private QuizServiceImpl serviceQuiz;
	
	
	/*
	 * 		     <-------- LEIA ME -------->
	 * 
	 * VERIFICA SE O ID QUE ESTA DENTRO DO METADO ESTA PRESENTE NA BASE
	 * 
	 * linha 54 troca 2L para 3L ou 4L
	 * 
	 */


	@Test
	@Order(1)
	void buscaQuizPorIdService() {
		Mockito.when(mapperQuiz.quizDomainToQuizDto(Mockito.any(Quiz.class))).thenReturn(new QuizDTO());
		Quiz quiz = new Quiz();
		Mockito.when(repositoryQuiz.findById(Mockito.anyLong())).thenReturn(Optional.of(quiz));
		QuizDTO dto = serviceQuiz.findById(2L);
		Assert.assertNotNull("message", dto);

	}

	@Test
	@Order(2)
	void buscarTodosQuizService() {
		List<QuizDTO> list = serviceQuiz.getAll();
		Assert.assertNotNull("message", list);
	}

}
