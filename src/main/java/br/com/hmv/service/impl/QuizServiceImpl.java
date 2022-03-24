package br.com.hmv.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.hmv.dto.QuizDTO;
import br.com.hmv.entity.Paciente;
import br.com.hmv.entity.Quiz;
import br.com.hmv.mapper.QuizMapperManual;
import br.com.hmv.repository.PacienteRepository;
import br.com.hmv.repository.QuizRepository;
import br.com.hmv.service.QuizService;

@Service
@Transactional
public class QuizServiceImpl implements QuizService {
	
	
	@Autowired
	private QuizRepository repository;
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Autowired
	private QuizMapperManual mapper;

	@Override
	public String save(QuizDTO quizDTO, HttpStatus ok) {

		
		Paciente paciente = pacienteRepository.findByIdpaciente(quizDTO.getIdPaciente());
		
		quizDTO.setIdPaciente(paciente.getId());
		Quiz quiz = mapper.quizDtoToQuizDomain(quizDTO);
		
		quiz.setPaciente(paciente);
		//quiz.getPaciente().setId(paciente.getId());
		
		repository.save(quiz);
		
		return "Quiz cadastrado";
	}

	@Override
	public List<QuizDTO> getAll() {
		List<Quiz> quiz = repository.findAll();
		return mapper.listQuizDomainToListQuizDto(quiz);
	}

	
}
