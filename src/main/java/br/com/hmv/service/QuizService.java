package br.com.hmv.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.com.hmv.dto.QuizDTO;

@Service
@Transactional
public interface QuizService {

	String save(QuizDTO quizDTO);
	
	List<QuizDTO> getAll();

	QuizDTO findById(Long id);


}
