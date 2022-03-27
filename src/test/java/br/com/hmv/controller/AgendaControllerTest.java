package br.com.hmv.controller;

//@SpringBootTest 
//@ExtendWith(MockitoExtension.class) 
//@AutoConfigureMockMvc 
//public class AgendaControllerTest {
//	
//	@InjectMocks
//	private AgendaController controller;
//	
//	@Mock
//	private AgendaService service;
//	
//	@Autowired
//	private MockMvc mockMvc;
//	
//	/*
//	 * 		     <-------- LEIA ME -------->
//	 * 
//	 * VERIFICA SE O ID QUE ESTA DENTRO DO METADO ESTA PRESENTE NA BASE
//	 * 
//	 * linha 62 = "d}",1)" ,_ trocar o 1 por 2 ou 3
//	 * 
//	 */
//	
//	@Test
//	@Order(1)
//	void salvarAgenda() {
//		Mockito.when(service.save(Mockito.any())).thenReturn("ok");
//		AgendaDTO dto = new AgendaDTO();
//		dto.setDataConsulta(null);
//		
//		ResponseEntity<String> dtoEntity = controller.save(dto);
//		Assert.assertNotNull("message", dtoEntity);
//	}
//	
//	@Test
//	@Order(2)
//	void buscarAgendaPorId() throws Exception {
//		this.mockMvc.perform(
//				get("/api/v1/agenda/findById/{id}",1)
//				.accept(MediaType.APPLICATION_JSON))
//	      .andDo(print())
//	      .andExpect(status().is2xxSuccessful());
//	}
//	
//	@Test
//	@Order(3)
//	void todosQuiz() throws Exception {		
//		this.mockMvc.perform( MockMvcRequestBuilders
//				      .get("/api/v1/agenda/getAll")
//				      .accept(MediaType.APPLICATION_JSON))
//				      .andDo(print())
//				      .andExpect(status().is2xxSuccessful());
//	}
//}
