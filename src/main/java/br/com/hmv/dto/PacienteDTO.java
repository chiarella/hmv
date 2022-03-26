package br.com.hmv.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

public class PacienteDTO implements Serializable {

	private static final long serialVersionUID = 3510963398910862749L;
	private Long id;
	private String nomePaciente;
	private String sobrenomePaciente;
	private String emailPaciente;
	private String cpf;
	private String enderecoRua;
	private String enderecoNro;
	private String enderecoComplemento;
	private String enderecoBairro;
	private String enderecoCidade;
	private String enderecoUF;
	private String enderecoCep;
	private BigInteger telefoneFixoPaciente;
	private BigInteger telefoneCelPaciente;
	private Integer idadePaciente;
	private String observacoesPaciente;
	private String convenio;
	private String numeroCarteirinha;
	
	private List<DoencaDTO> doencas;
	private List<ExameDTO> exames;
	private List<ResponsavelDTO> responsaveis;
	private List<MedicamentoDTO> medicamentos;
	private List<HabitoDTO> habitos;
	private List<QuizDTO> quiz;
	private List<AgendaDTO> agendas;

	public PacienteDTO() {
	}

	public PacienteDTO(Long id, String nomePaciente, String sobrenomePaciente, String emailPaciente, String cpf,
			String enderecoRua, String enderecoNro, String enderecoComplemento, String enderecoBairro,
			String enderecoCidade, String enderecoUF, String enderecoCep, BigInteger telefoneFixoPaciente,
			BigInteger telefoneCelPaciente, Integer idadePaciente, String observacoesPaciente, String convenio,
			String numeroCarteirinha, List<DoencaDTO> doencas, List<ExameDTO> exames, List<ResponsavelDTO> responsaveis,
			List<MedicamentoDTO> medicamentos, List<HabitoDTO> habitos, List<QuizDTO> quiz,
			List<AgendaDTO> agendas) {
		this.id = id;
		this.nomePaciente = nomePaciente;
		this.sobrenomePaciente = sobrenomePaciente;
		this.emailPaciente = emailPaciente;
		this.cpf = cpf;
		this.enderecoRua = enderecoRua;
		this.enderecoNro = enderecoNro;
		this.enderecoComplemento = enderecoComplemento;
		this.enderecoBairro = enderecoBairro;
		this.enderecoCidade = enderecoCidade;
		this.enderecoUF = enderecoUF;
		this.enderecoCep = enderecoCep;
		this.telefoneFixoPaciente = telefoneFixoPaciente;
		this.telefoneCelPaciente = telefoneCelPaciente;
		this.idadePaciente = idadePaciente;
		this.observacoesPaciente = observacoesPaciente;
		this.convenio = convenio;
		this.numeroCarteirinha = numeroCarteirinha;
		this.doencas = doencas;
		this.exames = exames;
		this.responsaveis = responsaveis;
		this.medicamentos = medicamentos;
		this.habitos = habitos;
		this.quiz = quiz;
		this.agendas = agendas;
	}

	@Override
	public String toString() {
		return "PacienteDTO [id=" + id + ", nomePaciente=" + nomePaciente + ", sobrenomePaciente=" + sobrenomePaciente
				+ ", emailPaciente=" + emailPaciente + ", cpf=" + cpf + ", enderecoRua=" + enderecoRua
				+ ", enderecoNro=" + enderecoNro + ", enderecoComplemento=" + enderecoComplemento + ", enderecoBairro="
				+ enderecoBairro + ", enderecoCidade=" + enderecoCidade + ", enderecoUF=" + enderecoUF
				+ ", enderecoCep=" + enderecoCep + ", telefoneFixoPaciente=" + telefoneFixoPaciente
				+ ", telefoneCelPaciente=" + telefoneCelPaciente + ", idadePaciente=" + idadePaciente
				+ ", observacoesPaciente=" + observacoesPaciente + ", convenio=" + convenio + ", numeroCarteirinha="
				+ numeroCarteirinha + ", doencas=" + doencas + ", exames=" + exames + ", responsaveis=" + responsaveis
				+ ", medicamentos=" + medicamentos + ", habitos=" + habitos + ", quizSintomas=" + quiz
				+ ", agendas=" + agendas + "]";
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

	public String getEmailPaciente() {
		return emailPaciente;
	}

	public void setEmailPaciente(String emailPaciente) {
		this.emailPaciente = emailPaciente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEnderecoRua() {
		return enderecoRua;
	}

	public void setEnderecoRua(String enderecoRua) {
		this.enderecoRua = enderecoRua;
	}

	public String getEnderecoNro() {
		return enderecoNro;
	}

	public void setEnderecoNro(String enderecoNro) {
		this.enderecoNro = enderecoNro;
	}

	public String getEnderecoComplemento() {
		return enderecoComplemento;
	}

	public void setEnderecoComplemento(String enderecoComplemento) {
		this.enderecoComplemento = enderecoComplemento;
	}

	public String getEnderecoBairro() {
		return enderecoBairro;
	}

	public void setEnderecoBairro(String enderecoBairro) {
		this.enderecoBairro = enderecoBairro;
	}

	public String getEnderecoCidade() {
		return enderecoCidade;
	}

	public void setEnderecoCidade(String enderecoCidade) {
		this.enderecoCidade = enderecoCidade;
	}

	public String getEnderecoUF() {
		return enderecoUF;
	}

	public void setEnderecoUF(String enderecoUF) {
		this.enderecoUF = enderecoUF;
	}

	public String getEnderecoCep() {
		return enderecoCep;
	}

	public void setEnderecoCep(String enderecoCep) {
		this.enderecoCep = enderecoCep;
	}

	public BigInteger getTelefoneFixoPaciente() {
		return telefoneFixoPaciente;
	}

	public void setTelefoneFixoPaciente(BigInteger telefoneFixoPaciente) {
		this.telefoneFixoPaciente = telefoneFixoPaciente;
	}

	public BigInteger getTelefoneCelPaciente() {
		return telefoneCelPaciente;
	}

	public void setTelefoneCelPaciente(BigInteger telefoneCelPaciente) {
		this.telefoneCelPaciente = telefoneCelPaciente;
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

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public String getNumeroCarteirinha() {
		return numeroCarteirinha;
	}

	public void setNumeroCarteirinha(String numeroCarteirinha) {
		this.numeroCarteirinha = numeroCarteirinha;
	}

	public List<DoencaDTO> getDoencas() {
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

	public List<ResponsavelDTO> getResponsaveis() {
		return responsaveis;
	}

	public void setResponsaveis(List<ResponsavelDTO> responsaveis) {
		this.responsaveis = responsaveis;
	}

	public List<MedicamentoDTO> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<MedicamentoDTO> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public List<HabitoDTO> getHabitos() {
		return habitos;
	}

	public void setHabitos(List<HabitoDTO> habitos) {
		this.habitos = habitos;
	}

	public List<QuizDTO> getQuiz() {
		return quiz;
	}

	public void setQuizSintomas(List<QuizDTO> quiz) {
		this.quiz = quiz;
	}

	public List<AgendaDTO> getAgendas() {
		return agendas;
	}

	public void setAgendas(List<AgendaDTO> agendas) {
		this.agendas = agendas;
	}
	
	

}
