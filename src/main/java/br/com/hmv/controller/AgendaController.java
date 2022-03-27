package br.com.hmv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hmv.dto.AgendaDTO;
import br.com.hmv.service.AgendaService;

@RestController
@RequestMapping("/api/v1/agenda")
public class AgendaController {

	@Autowired
	private AgendaService service;

	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody AgendaDTO agendaDTO) {
		return new ResponseEntity<>(service.save(agendaDTO), HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<AgendaDTO>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<AgendaDTO> findById(@PathVariable(value = "id")Long id) {
		return ResponseEntity.ok(service.findById(id));
	}

}
