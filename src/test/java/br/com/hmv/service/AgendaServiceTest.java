package br.com.hmv.service;

//@ExtendWith(MockitoExtension.class)
//public class AgendaServiceTest {
//	
//	@Mock
//	private AgendaMapperManual mapperAgenda;
//
//	@Mock
//	private AgendaRepository repositoryAgenda;
//
//	@Mock
//	private AgendaController controllerAgenda;
//
//	@InjectMocks
//	private AgendaServiceImpl serviceAgenda;
//	
//	
//	/*
//	 * 		     <-------- LEIA ME -------->
//	 * 
//	 * VERIFICA SE O ID QUE ESTA DENTRO DO METADO ESTA PRESENTE NA BASE
//	 * linha 54 troca 2L para 3L ou 4L
//	 * 
//	 */
//
//
//	@Test
//	@Order(1)
//	void buscaAgendaPorIdService() {
//		Mockito.when(mapperAgenda.agendaDomainToAgendaDto(Mockito.any(Agenda.class))).thenReturn(new AgendaDTO());
//		Agenda agenda = new Agenda();
//		Mockito.when(repositoryAgenda.findById(Mockito.anyLong())).thenReturn(Optional.of(agenda));
//		AgendaDTO dto = serviceAgenda.findById(2L);
//		Assert.assertNotNull("message", dto);
//
//	}
//	
//	@Test
//	@Order(2)
//	void buscarTodasAgendas() {
//		List<AgendaDTO> list = serviceAgenda.getAll();
//		Assert.assertNotNull("message", list);
//	}
//
//}
