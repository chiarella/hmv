package br.com.hmv.entity;

import java.io.Serializable;
import java.math.BigInteger;

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
@Table(name = "tb_responsavel")
public class Responsavel implements Serializable {

	private static final long serialVersionUID = 3257060286532851571L;

	@Id
	@Column(name = "id_responsavel")
	@SequenceGenerator(name = "responsavel", sequenceName = "sq_tb_responsavel", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idResponsavel;

	@Column(name = "nome_responsavel")
	private String nomeResponsavel;

	@Column(name = "sobrenome_responsavel")
	private String sobrenomeResponsavel;

	@Column(name = "parentesco_responsavel")
	private String parentescoResponsavel;

	@Column(name = "email_responsavel")
	private String emailResponsavel;

	@Column(name = "telefone_fixo_responsavel")
	private BigInteger telefoneFixoResponsavel;

	@Column(name = "telefone_cel_responsavel")
	private BigInteger telefoneCelResponsavel;

	@Column(name = "observacoes_responsavel")
	private String observacoesResponsavel;

	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	public Responsavel() {
	}

	public Responsavel(Long idResponsavel, String nomeResponsavel, String sobrenomeResponsavel,
			String parentescoResponsavel, String emailResponsavel, BigInteger telefoneFixoResponsavel,
			BigInteger telefoneCelResponsavel, String observacoesResponsavel, Paciente paciente) {
		this.idResponsavel = idResponsavel;
		this.nomeResponsavel = nomeResponsavel;
		this.sobrenomeResponsavel = sobrenomeResponsavel;
		this.parentescoResponsavel = parentescoResponsavel;
		this.emailResponsavel = emailResponsavel;
		this.telefoneFixoResponsavel = telefoneFixoResponsavel;
		this.telefoneCelResponsavel = telefoneCelResponsavel;
		this.observacoesResponsavel = observacoesResponsavel;
		this.paciente = paciente;
	}

	public Long getIdResponsavel() {
		return idResponsavel;
	}

	public void setIdResponsavel(Long idResponsavel) {
		this.idResponsavel = idResponsavel;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getSobrenomeResponsavel() {
		return sobrenomeResponsavel;
	}

	public void setSobrenomeResponsavel(String sobrenomeResponsavel) {
		this.sobrenomeResponsavel = sobrenomeResponsavel;
	}

	public String getParentescoResponsavel() {
		return parentescoResponsavel;
	}

	public void setParentescoResponsavel(String parentescoResponsavel) {
		this.parentescoResponsavel = parentescoResponsavel;
	}

	public String getEmailResponsavel() {
		return emailResponsavel;
	}

	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}

	public BigInteger getTelefoneFixoResponsavel() {
		return telefoneFixoResponsavel;
	}

	public void setTelefoneFixoResponsavel(BigInteger telefoneFixoResponsavel) {
		this.telefoneFixoResponsavel = telefoneFixoResponsavel;
	}

	public BigInteger getTelefoneCelResponsavel() {
		return telefoneCelResponsavel;
	}

	public void setTelefoneCelresponsavel(BigInteger telefoneCelResponsavel) {
		this.telefoneCelResponsavel = telefoneCelResponsavel;
	}

	public String getObservacoesResponsavel() {
		return observacoesResponsavel;
	}

	public void setObservacoesResponsavel(String observacoesResponsavel) {
		this.observacoesResponsavel = observacoesResponsavel;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
