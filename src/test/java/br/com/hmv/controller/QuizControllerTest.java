package br.com.hmv.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import br.com.hmv.dto.QuizDTO;
import br.com.hmv.service.QuizService;

@SpringBootTest 
@ExtendWith(MockitoExtension.class) 
@AutoConfigureMockMvc 
public class QuizControllerTest {
	
	@InjectMocks
	private QuizController controller;
	
	@Mock
	private QuizService service;
	
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	@Order(1)
	void salvarQuiz() {
		Mockito.when(service.save(Mockito.any())).thenReturn("ok");
		QuizDTO dto = new QuizDTO();
		dto.setDescricaoQuiz("Descrição quiz teste");
		
		ResponseEntity<String> dtoEntity = controller.save(dto);
		Assert.assertNotNull("message", dtoEntity);
		
	}
	
	@Test
	@Order(2)
	void buscarQuizPorId() throws Exception {
		this.mockMvc.perform(
				get("/api/v1/quiz/findById/{id}",1)
				.accept(MediaType.APPLICATION_JSON))
	      .andDo(print())
	      .andExpect(status().is2xxSuccessful());
	}
	
	@Test
	@Order(3)
	void todosQuiz() throws Exception {		
		this.mockMvc.perform( MockMvcRequestBuilders
				      .get("/api/v1/quiz/getAll")
				      .accept(MediaType.APPLICATION_JSON))
				      .andDo(print())
				      .andExpect(status().is2xxSuccessful());
	}
	
	
}
