package br.com.hmv.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
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

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.hmv.dto.AgendaDTO;
import br.com.hmv.dto.DoencaDTO;
import br.com.hmv.dto.ExameDTO;
import br.com.hmv.dto.HabitoDTO;
import br.com.hmv.dto.MedicamentoDTO;
import br.com.hmv.dto.PacienteDTO;
import br.com.hmv.dto.QuizDTO;
import br.com.hmv.dto.ResponsavelDTO;
import br.com.hmv.service.PacienteService;



//@SpringBootTest // Para test "Order 3"
//@ExtendWith(MockitoExtension.class) // Para test "Order 1 e 2"
//@AutoConfigureMockMvc // Para test "Order 3"
//public class PacienteControllerTest {
//
//	/*
//	 * 		     <-------- LEIA ME -------->
//	 * 
//	 * 		metodo deletarPaciente() DESCOMENTAR O TESTE 7 (VAI APAGAR O ID 3)
//	 * 
//	 * 
//	 * OBS se der erro no teste do deletarPaciente alterar o id do metodo
//	 * (provavelmente o id em questão) ja foi apagado alterar o numero nessa linha
//	 * delete("/api/v1/paciente/delete/{id}",1) ALTERAR DE 1 para 2 ou 3 ou 4
//	 * 
//	 * metodo deletarPaciente() DESCOMENTAR O TESTE 7
//	 * 
//	 * VERIFICA SE O ID QUE ESTA DENTRO DO METADO ESTA PRESENTE NA BASE
//	 * 
//	 */
//
//	@InjectMocks
//	private PacienteController controller;
//
//	@Mock
//	private PacienteService service;
//
//	@Autowired
//	private MockMvc mockMvc;
//	
////	@Test
////	@Order(7)
////	void deletarPaciente() throws Exception {
////			this.mockMvc.perform(
////				/*
////				 * OBS se der erro no teste do deletar o paciente 
////				 * alterar o id do metodo (provavelmente o id em questão)
////				 * ja foi apagado alterar o numero nessa linha
////				 * 	delete("/api/v1/paciente/delete/{id}",3)
////				 * ALTERAR DE 1 para 2 ou 3 ou 4
////				 * 
////				 * metodo deletarPaciente()
////				 * 
////				 */
////					delete("/api/v1/paciente/delete/{id}",3)
////					.accept(MediaType.APPLICATION_JSON))
////		      .andDo(print())
////		      .andExpect(status().is2xxSuccessful());
////		}
////	
//
//	@Test
//	@Order(1)
//	void salvarPacienteComListas() {
//		// Mockito.when(service.save(null, null))
//		Mockito.when(service.save(Mockito.any())).thenReturn("ok");
//		PacienteDTO dto = new PacienteDTO();
//		dto.setNomePaciente("Anderson");
//		List<DoencaDTO> listDoenca = new ArrayList<>();
//		dto.setDoencas(listDoenca);
//		List<ExameDTO> listExame = new ArrayList<>();
//		dto.setExames(listExame);
//		List<ResponsavelDTO> listResp = new ArrayList<>();
//		dto.setResponsaveis(listResp);
//		List<MedicamentoDTO> listMedicamentos = new ArrayList<>();
//		dto.setMedicamentos(listMedicamentos);
//		List<HabitoDTO> listHabito = new ArrayList<>();
//		dto.setHabitos(listHabito);
//		List<QuizDTO> lisQuiz = new ArrayList<>();
//		dto.setQuizSintomas(lisQuiz);
//		List<AgendaDTO> listAgenda = new ArrayList<>();
//		dto.setAgendas(listAgenda);
//
//		ResponseEntity<String> dtoEntity = controller.save(dto);
//		Assert.assertNotNull("message", dtoEntity);
//	}
//
//	@Test
//	@Order(2)
//	void salvarPacienteSemListas() {
//		Mockito.when(service.save(Mockito.any())).thenReturn("ok");
//		PacienteDTO dto = new PacienteDTO();
//
//		ResponseEntity<String> dtoEntity = controller.save(dto);
//		Assert.assertNotNull("message", dtoEntity);
//	}
//
//	@Test
//	@Order(3)
//	void buscarPacientePorId() throws Exception {
//		this.mockMvc.perform(get("/api/v1/paciente/findById/{id}", 2).accept(MediaType.APPLICATION_JSON)).andDo(print())
//				.andExpect(status().is2xxSuccessful());
//	}
//
//	@Test
//	@Order(4)
//	void todosPacientes() throws Exception {
//		this.mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/paciente/getAll").accept(MediaType.APPLICATION_JSON))
//				.andDo(print()).andExpect(status().is2xxSuccessful());
//	}
//
//	@Test
//	@Order(5)
//	void alterarPaciente() throws Exception {
//		this.mockMvc.perform(put("/api/v1/paciente/update/{id}", 2).accept(MediaType.APPLICATION_JSON))
//				.andDo(print())
//				.andExpect(status().is2xxSuccessful());
//	}
//	
//	@Test
//	@Order(6)
//	void buscarPacienteCpf() throws Exception {
//		this.mockMvc.perform(get("/api/v1/paciente/findByCpf/{cpf}", "123123")
//				.accept(MediaType.APPLICATION_JSON))
//				.andDo(print())
//				.andExpect(status().is2xxSuccessful());
//	}
//		
//
//	static String asJsonString(final Object obj) {
//		try {
//			String json = new ObjectMapper().writeValueAsString(obj);
//			return json;
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	static String randomString() {
//		String texto = null;
//		try {
//			int length = 10;
//			boolean useLetters = true;
//			boolean useNumbers = false;
//			texto = RandomStringUtils.random(length, useLetters, useNumbers);
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//		return texto;
//
//	}
//
//}
