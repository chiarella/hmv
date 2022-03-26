package br.com.hmv.dto;

import java.io.Serializable;
import java.util.List;

public class PacienteRetornoQuizDTO implements Serializable {

	private static final long serialVersionUID = 127982415913264600L;

	private Long id;
	private String nomePaciente;
	private String sobrenomePaciente;
	private String cpf;
	private Integer idadePaciente;
	private String observacoesPaciente;

	private List<DoencaDTO> doencas;
	private List<ExameDTO> exames;
	private List<MedicamentoDTO> medicamentos;
	private List<QuizDTO> quiz;
	
	@Override
	public String toString() {
		return "Quiz id: " + id +  " CPF: " + cpf + "\n " 
				+ "Nome: " + nomePaciente+ " " + sobrenomePaciente + "\n " 
				+ "Idade: " + idadePaciente + " / "+ "Obs: "+ observacoesPaciente + "\n " 
				+ doencas + "\n "
				+ exames + "\n "
				+ medicamentos + "\n "
				+ quiz;
	}

	public PacienteRetornoQuizDTO() {
	}

	public PacienteRetornoQuizDTO(Long id, String nomePaciente, String sobrenomePaciente, String cpf,
			Integer idadePaciente, String observacoesPaciente, List<DoencaDTO> doencas, List<ExameDTO> exames,
			List<MedicamentoDTO> medicamentos, List<QuizDTO> quiz) {
		this.id = id;
		this.nomePaciente = nomePaciente;
		this.sobrenomePaciente = sobrenomePaciente;
		this.cpf = cpf;
		this.idadePaciente = idadePaciente;
		this.observacoesPaciente = observacoesPaciente;
		this.doencas = doencas;
		this.exames = exames;
		this.medicamentos = medicamentos;
		this.quiz = quiz;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getSobrenomePaciente() {
		return sobrenomePaciente;
	}

	public void setSobrenomePaciente(String sobrenomePaciente) {
		this.sobrenomePaciente = sobrenomePaciente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdadePaciente() {
		return idadePaciente;
	}

	public void setIdadePaciente(Integer idadePaciente) {
		this.idadePaciente = idadePaciente;
	}

	public String getObservacoesPaciente() {
		return observacoesPaciente;
	}

	public void setObservacoesPaciente(String observacoesPaciente) {
		this.observacoesPaciente = observacoesPaciente;
	}

	public List<DoencaDTO> getDoencas() {
		if (doencas.isEmpty()) {
			return null;
		}
		return doencas;
	}

	public void setDoencas(List<DoencaDTO> doencas) {
		this.doencas = doencas;
	}

	public List<ExameDTO> getExames() {
		return exames;
	}

	public void setExames(List<ExameDTO> exames) {
		this.exames = exames;
	}

	public List<MedicamentoDTO> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<MedicamentoDTO> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public List<QuizDTO> getQuiz() {
		return quiz;
	}

	public void setQuiz(List<QuizDTO> quiz) {
		this.quiz = quiz;
	}

}
