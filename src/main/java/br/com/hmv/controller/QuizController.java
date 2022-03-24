package br.com.hmv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hmv.dto.QuizDTO;
import br.com.hmv.service.QuizService;

@RestController
@RequestMapping("/api/v1/quiz")
public class QuizController {
	
	@Autowired
	private QuizService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody QuizDTO quizDTO) throws Exception {
			return new ResponseEntity<>(service.save(quizDTO, null), HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<QuizDTO>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}

}
