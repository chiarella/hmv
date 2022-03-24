package br.com.hmv.dto;

import java.io.Serializable;

//@Getter
//@Setter
public class ExameDTO implements Serializable {

	private static final long serialVersionUID = -3528437206047777453L;
	private Long idExame;
	private Long idPaciente;
	private String tipoExame;
	private String descricaoExame;
	private String observacaoExame;

	public ExameDTO() {
	}

	public ExameDTO(Long idExame, Long idPaciente, String tipoExame, String descricaoExame, String observacaoExame) {
		this.idExame = idExame;
		this.idPaciente = idPaciente;
		this.tipoExame = tipoExame;
		this.descricaoExame = descricaoExame;
		this.observacaoExame = observacaoExame;
	}

	public Long getIdExame() {
		return idExame;
	}

	public void setIdExame(Long idExame) {
		this.idExame = idExame;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}

	public String getDescricaoExame() {
		return descricaoExame;
	}

	public void setDescricaoExame(String descricaoExame) {
		this.descricaoExame = descricaoExame;
	}

	public String getObservacaoExame() {
		return observacaoExame;
	}

	public void setObservacaoExame(String observacaoExame) {
		this.observacaoExame = observacaoExame;
	}

}
