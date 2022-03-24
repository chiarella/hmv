package br.com.hmv.dto;

import java.io.Serializable;
import java.math.BigInteger;

public class ResponsavelDTO implements Serializable {

	private static final long serialVersionUID = 4748534529882974622L;
	private Long idResponsavel;
	private String nomeResponsavel;
	private String sobrenomeResponsavel;
	private String parentescoResponsavel;
	private String emailResponsavel;
	private BigInteger telefoneFixoResponsavel;
	private BigInteger telefoneCelresponsavel;
	private String observacoesResponsavel;
	private Long idPaciente;

	public ResponsavelDTO() {
	}

	public ResponsavelDTO(Long idResponsavel, String nomeResponsavel, String sobrenomeResponsavel,
			String parentescoResponsavel, String emailResponsavel, BigInteger telefoneFixoResponsavel,
			BigInteger telefoneCelresponsavel, String observacoesResponsavel, Long idPaciente) {
		this.idResponsavel = idResponsavel;
		this.nomeResponsavel = nomeResponsavel;
		this.sobrenomeResponsavel = sobrenomeResponsavel;
		this.parentescoResponsavel = parentescoResponsavel;
		this.emailResponsavel = emailResponsavel;
		this.telefoneFixoResponsavel = telefoneFixoResponsavel;
		this.telefoneCelresponsavel = telefoneCelresponsavel;
		this.observacoesResponsavel = observacoesResponsavel;
		this.idPaciente = idPaciente;
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

	public BigInteger getTelefoneCelresponsavel() {
		return telefoneCelresponsavel;
	}

	public void setTelefoneCelresponsavel(BigInteger telefoneCelresponsavel) {
		this.telefoneCelresponsavel = telefoneCelresponsavel;
	}

	public String getObservacoesResponsavel() {
		return observacoesResponsavel;
	}

	public void setObservacoesResponsavel(String observacoesResponsavel) {
		this.observacoesResponsavel = observacoesResponsavel;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	@Override
	public String toString() {
		return "ResponsavelDTO [idResponsavel=" + idResponsavel + ", nomeResponsavel=" + nomeResponsavel
				+ ", sobrenomeResponsavel=" + sobrenomeResponsavel + ", parentescoResponsavel=" + parentescoResponsavel
				+ ", emailResponsavel=" + emailResponsavel + ", telefoneFixoResponsavel=" + telefoneFixoResponsavel
				+ ", telefoneCelresponsavel=" + telefoneCelresponsavel + ", observacoesResponsavel="
				+ observacoesResponsavel + ", idPaciente=" + idPaciente + "]";
	}
	
	

}
