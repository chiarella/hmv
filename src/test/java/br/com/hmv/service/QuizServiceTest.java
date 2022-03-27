package br.com.hmv.service;

//@ExtendWith(MockitoExtension.class)
//public class QuizServiceTest {
//
//	@Mock
//	private QuizMapperManual mapperQuiz;
//
//	@Mock
//	private QuizRepository repositoryQuiz;
//
//	@Mock
//	private QuizController controllerQuiz;
//
//	@InjectMocks
//	private QuizServiceImpl serviceQuiz;
//	
//	
//	/*
//	 * 		     <-------- LEIA ME -------->
//	 * 
//	 * VERIFICA SE O ID QUE ESTA DENTRO DO METADO ESTA PRESENTE NA BASE
//	 * 
//	 * linha 54 troca 2L para 3L ou 4L
//	 * 
//	 */
//
//
//	@Test
//	@Order(1)
//	void buscaQuizPorIdService() {
//		Mockito.when(mapperQuiz.quizDomainToQuizDto(Mockito.any(Quiz.class))).thenReturn(new QuizDTO());
//		Quiz quiz = new Quiz();
//		Mockito.when(repositoryQuiz.findById(Mockito.anyLong())).thenReturn(Optional.of(quiz));
//		QuizDTO dto = serviceQuiz.findById(2L);
//		Assert.assertNotNull("message", dto);
//
//	}
//
//	@Test
//	@Order(2)
//	void buscarTodosQuizService() {
//		List<QuizDTO> list = serviceQuiz.getAll();
//		Assert.assertNotNull("message", list);
//	}
//
//}
