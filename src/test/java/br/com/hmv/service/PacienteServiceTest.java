package br.com.hmv.service;

//@ExtendWith(MockitoExtension.class) 
//public class PacienteServiceTest {
//	
//	@Mock
//	private PacienteMapperManual mapper;
//	
//	@Mock
//	private PacienteRepository repository;
//	
//	@Mock
//	private PacienteController controller;
//	
//	@InjectMocks
//	private PacienteServiceImpl service;
//	
//	/*
//	 * 		     <-------- LEIA ME -------->
//	 * 
//	 * VERIFICA SE O ID QUE ESTA DENTRO DO METADO ESTA PRESENTE NA BASE
//	 * 
//	 */
//	
//	
//	@Test
//	@Order(1)
//	void cadastrarPacienteServiceTest() {
//		
//		Paciente paciente = new Paciente();
//		PacienteDTO dto = new PacienteDTO();
//		Mockito.when(repository.save(Mockito.any())).thenReturn(paciente);
//		Assert.assertNotNull(service.save(dto));
//	}
//	
//	@Test
//	@Order(2)
//	void cadastrarPacienteComListaServiceTest() {
//		
//		Paciente paciente = new Paciente();
//		
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
//		Mockito.when(repository.save(Mockito.any())).thenReturn(paciente);
//		
//		Assert.assertNotNull(service.save(dto));
//	}
//	
//	@Test
//	@Order(3)
//	void buscaPacientePorIdfluxoService() {
//		Mockito.when(mapper.pacienteDomainToPacienteDto(Mockito.any
//				(Paciente.class))).thenReturn(new PacienteDTO());
//		Paciente paciente = new Paciente();
//		Mockito.when(repository.findById(Mockito.anyLong())).thenReturn(Optional.of(paciente));
//		PacienteDTO dto = service.findById(2l);
//		Assert.assertNotNull("message", dto);
//	}
//	
//	
//	@Test
//	@Order(4)
//	void buscarTodosPacienteService() {
//		List<PacienteDTO> list = service.getAll();
//		Assert.assertNotNull("message", list);
//	}
//
//}
