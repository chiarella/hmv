package br.com.hmv.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_paciente")
public class Paciente implements Serializable {

	private static final long serialVersionUID = -2855045057327773745L;

	@Id
	@Column(name = "id_paciente")
	@SequenceGenerator(name = "paciente", sequenceName = "sq_tb_paciente", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome_paciente")
	private String nomePaciente;

	@Column(name = "sobrenome_paciente")
	private String sobrenomePaciente;

	@Column(name = "email_paciente")
	private String emailPaciente;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "endereco_rua")
	private String enderecoRua;

	@Column(name = "endereco_nro")
	private String enderecoNro;

	@Column(name = "endereco_complemento")
	private String enderecoComplemento;

	@Column(name = "endereco_bairro")
	private String enderecoBairro;

	@Column(name = "endereco_cidade")
	private String enderecoCidade;

	@Column(name = "endereco_UF")
	private String enderecoUF;

	@Column(name = "endereco_cep")
	private String enderecoCep;

	@Column(name = "telefone_fixo_paciente")
	private BigInteger telefoneFixoPaciente;

	@Column(name = "telefone_cel_paciente")
	private BigInteger telefoneCelPaciente;

	@Column(name = "idade_paciente")
	private Integer idadePaciente;

	@Column(name = "observacoes_paciente")
	private String observacoesPaciente;

	@Column(name = "convenio")
	private String convenio;

	@Column(name = "numero_carteirinha")
	private String numeroCarteirinha;

	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Doenca> doencas;

	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Exame> exames;

	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Responsavel> responsaveis;

	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Medicamento> medicamentos;

	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Habito> habitos;

	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Quiz> quiz;

	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Agenda> agendas;

	
	public Paciente() {
	}

	public Paciente(Long id, String nomePaciente, String sobrenomePaciente, String emailPaciente, String cpf,
			String enderecoRua, String enderecoNro, String enderecoComplemento, String enderecoBairro,
			String enderecoCidade, String enderecoUF, String enderecoCep, BigInteger telefoneFixoPaciente,
			BigInteger telefoneCelPaciente, Integer idadePaciente, String observacoesPaciente, String convenio,
			String numeroCarteirinha, List<Doenca> doencas, List<Exame> exames, List<Responsavel> responsaveis,
			List<Medicamento> medicamentos, List<Habito> habitos, List<Quiz> quiz, List<Agenda> agendas) {
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

	public List<Doenca> getDoencas() {
		return doencas;
	}

	public void setDoencas(List<Doenca> doencas) {
		this.doencas = doencas;
	}

	public List<Exame> getExames() {
		return exames;
	}

	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}

	public List<Responsavel> getResponsaveis() {
		return responsaveis;
	}

	public void setResponsaveis(List<Responsavel> responsaveis) {
		this.responsaveis = responsaveis;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public List<Habito> getHabitos() {
		return habitos;
	}

	public void setHabitos(List<Habito> habitos) {
		this.habitos = habitos;
	}

	public List<Quiz> getQuiz() {
		return quiz;
	}

	public void setQuiz(List<Quiz> quiz) {
		this.quiz = quiz;
	}

	public List<Agenda> getAgendas() {
		return agendas;
	}

	public void setAgendas(List<Agenda> agendas) {
		this.agendas = agendas;
	}
	
	

}
