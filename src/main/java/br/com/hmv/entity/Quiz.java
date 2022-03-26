package br.com.hmv.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_quiz")
public class Quiz implements Serializable {

	private static final long serialVersionUID = 8221027251891743L;

	@Id
	@SequenceGenerator(name = "quiz", sequenceName = "sq_tb_quiz", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_quiz")
	private Long idQuiz;

	@Column(name = "descricao_quiz")
	private String descricaoQuiz;
	
	@Column(name = "status_quiz")
	private Boolean statusQuiz;	
	
	@Column(name = "data_quiz")
	private LocalDateTime dataQuiz;
	
	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	
	public Quiz() {
	}

	public Quiz(Long idQuiz, String descricaoQuiz, Boolean statusQuiz,
			LocalDateTime dataQuiz,
			Paciente paciente) {
		this.idQuiz = idQuiz;
		this.descricaoQuiz = descricaoQuiz;
		this.statusQuiz = statusQuiz;
		this.dataQuiz = dataQuiz;
		this.paciente = paciente;
	}

	public Long getIdQuiz() {
		return idQuiz;
	}

	public void setIdQuiz(Long idQuiz) {
		this.idQuiz = idQuiz;
	}

	public String getDescricaoQuiz() {
		return descricaoQuiz;
	}

	public void setDescricaoQuiz(String descricaoQuiz) {
		this.descricaoQuiz = descricaoQuiz;
	}

	public Boolean getStatusQuiz() {
		return statusQuiz;
	}

	public void setStatusQuiz(Boolean statusQuiz) {
		this.statusQuiz = statusQuiz;
	}

	public LocalDateTime getDataQuiz() {
		return dataQuiz;
	}

	public void setDataQuiz(LocalDateTime dataQuiz) {
		this.dataQuiz = dataQuiz;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

//	public void setPaciente(Optional<Paciente> paciente2) {
//		// TODO Auto-generated method stub
//		
//	}
	
	
	

}
