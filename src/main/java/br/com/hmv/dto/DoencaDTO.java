package br.com.hmv.dto;

import java.io.Serializable;

public class DoencaDTO implements Serializable {

	private static final long serialVersionUID = -6426516780601462834L;
	private Long idDoenca;
	private Long idPaciente;
	private String descricaoDoenca;
	private String observacaoDoenca;

	public DoencaDTO() {
	}

	public DoencaDTO(Long idDoenca, Long idPaciente, String descricaoDoenca, String observacaoDoenca) {
		this.idDoenca = idDoenca;
		this.idPaciente = idPaciente;
		this.descricaoDoenca = descricaoDoenca;
		this.observacaoDoenca = observacaoDoenca;
	}

	public Long getIdDoenca() {
		return idDoenca;
	}

	public void setIdDoenca(Long idDoenca) {
		this.idDoenca = idDoenca;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getDescricaoDoenca() {
		return descricaoDoenca;
	}

	public void setDescricaoDoenca(String descricaoDoenca) {
		this.descricaoDoenca = descricaoDoenca;
	}

	public String getObservacaoDoenca() {
		return observacaoDoenca;
	}

	public void setObservacaoDoenca(String observacaoDoenca) {
		this.observacaoDoenca = observacaoDoenca;
	}

	@Override
	public String toString() {
		return "DoencaDTO [idDoenca=" + idDoenca + ", idPaciente=" + idPaciente + ", descricaoDoenca=" + descricaoDoenca
				+ ", observacaoDoenca=" + observacaoDoenca + "]";
	}

}
