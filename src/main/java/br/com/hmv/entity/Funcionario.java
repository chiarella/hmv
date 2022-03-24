package br.com.hmv.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


public class Funcionario {
	
	@Id
	@Column(name = "id_funcionario")
	@SequenceGenerator(name = "funcionario", sequenceName = "sq_tb_funcionario", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFuncionario;
	
	@Column(name = "nome_funcionario")
	private String nomeFuncionario;
	
	@Column(name = "cargo")
	private String cargo;
	
	@Column(name = "crm")
	private String crm;
	
	@Column(name = "especializacao")
	private String especializacao;
	
	

}
