package br.com.hmv.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.hmv.dto.QuizDTO;
import br.com.hmv.entity.Quiz;

@Component
public class QuizMapperManual {

	public Quiz quizDtoToQuizDomain(QuizDTO dto) {

		Quiz quiz = new Quiz();
		quiz.setIdQuiz(dto.getIdQuiz());
		quiz.setDescricaoQuiz(dto.getDescricaoQuiz());
		quiz.setDataQuiz(dto.getDataQuiz());
		quiz.setStatusQuiz(dto.getStatusQuiz());
		return quiz;
	}
	
	private QuizDTO quizDomainToQuizDto(Quiz domain) {
		QuizDTO quizDto = new QuizDTO();
		quizDto.setIdQuiz(domain.getIdQuiz());
		quizDto.setDescricaoQuiz(domain.getDescricaoQuiz());
		quizDto.setDataQuiz(domain.getDataQuiz());
		quizDto.setStatusQuiz(domain.getStatusQuiz());
		
		quizDto.setIdPaciente(domain.getPaciente().getId());
		return quizDto;
	}

	public List<QuizDTO> listQuizDomainToListQuizDto(List<Quiz> domains) {
		List<QuizDTO> listQuizDTOs =  new ArrayList<>();
		for (Quiz quiz : domains) {
			QuizDTO quizDto = this.quizDomainToQuizDto(quiz);
			listQuizDTOs.add(quizDto);
			
		}
		return listQuizDTOs;
	}

}
