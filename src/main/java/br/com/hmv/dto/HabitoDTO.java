package br.com.hmv.dto;

import java.io.Serializable;

public class HabitoDTO implements Serializable {


	private static final long serialVersionUID = -1207952878662951797L;
	private Long idHabito;
	private String descricaoHabito;
	private Boolean statusHabito;
	private Long idPaciente;
	
	

	@Override
	public String toString() {
		return "HabitoDTO [idHabito=" + idHabito + ", descricaoHabito=" + descricaoHabito + ", statusHabito="
				+ statusHabito + ", idPaciente=" + idPaciente + "]";
	}

	public HabitoDTO() {
	}

	public HabitoDTO(Long idHabito, String descricaoHabito, Boolean statusHabito, Long idPaciente) {
		this.idHabito = idHabito;
		this.descricaoHabito = descricaoHabito;
		this.statusHabito = statusHabito;
		this.idPaciente = idPaciente;
	}

	public Long getIdHabito() {
		return idHabito;
	}

	public void setIdHabito(Long idHabito) {
		this.idHabito = idHabito;
	}

	public String getDescricaoHabito() {
		return descricaoHabito;
	}

	public void setDescricaoHabito(String descricaoHabito) {
		this.descricaoHabito = descricaoHabito;
	}

	public Boolean getStatusHabito() {
		return statusHabito;
	}

	public void setStatusHabito(Boolean statusHabito) {
		this.statusHabito = statusHabito;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

}
