package br.com.hmv.service;

import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.hmv.controller.AgendaController;
import br.com.hmv.dto.AgendaDTO;
import br.com.hmv.dto.QuizDTO;
import br.com.hmv.entity.Agenda;
import br.com.hmv.mapper.AgendaMapperManual;
import br.com.hmv.repository.AgendaRepository;
import br.com.hmv.service.impl.AgendaServiceImpl;

@ExtendWith(MockitoExtension.class)
public class AgendaServiceTest {
	
	@Mock
	private AgendaMapperManual mapperAgenda;

	@Mock
	private AgendaRepository repositoryAgenda;

	@Mock
	private AgendaController controllerAgenda;

	@InjectMocks
	private AgendaServiceImpl serviceAgenda;
	
	
	/*
	 * 		     <-------- LEIA ME -------->
	 * 
	 * VERIFICA SE O ID QUE ESTA DENTRO DO METADO ESTA PRESENTE NA BASE
	 * linha 54 troca 2L para 3L ou 4L
	 * 
	 */


	@Test
	@Order(1)
	void buscaAgendaPorIdService() {
		Mockito.when(mapperAgenda.agendaDomainToAgendaDto(Mockito.any(Agenda.class))).thenReturn(new AgendaDTO());
		Agenda agenda = new Agenda();
		Mockito.when(repositoryAgenda.findById(Mockito.anyLong())).thenReturn(Optional.of(agenda));
		AgendaDTO dto = serviceAgenda.findById(2L);
		Assert.assertNotNull("message", dto);

	}
	
	@Test
	@Order(2)
	void buscarTodasAgendas() {
		List<AgendaDTO> list = serviceAgenda.getAll();
		Assert.assertNotNull("message", list);
	}

}
