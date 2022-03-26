package br.com.hmv.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class QuizDTO implements Serializable {
	
	private static final long serialVersionUID = -6666983020329387876L;
	private Long idQuiz;
	private String descricaoQuiz;
	private Boolean statusQuiz;	
	private LocalDateTime dataQuiz;
	private Long idPaciente;
	
	@Override
	public String toString() {
		return "Descricao Quiz: " + descricaoQuiz;
	}	
	
	
	public QuizDTO() {
	}
	
	public QuizDTO(Long idQuiz, String descricaoQuiz, Boolean statusQuiz, LocalDateTime dataQuiz,
			Long idPaciente) {
		this.idQuiz = idQuiz;
		this.descricaoQuiz = descricaoQuiz;
		this.statusQuiz = statusQuiz;
		this.dataQuiz = dataQuiz;
		this.idPaciente = idPaciente;
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
	public Long getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}
	
}
