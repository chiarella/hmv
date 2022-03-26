package br.com.hmv.dto;

import java.io.Serializable;

public class MedicamentoDTO implements Serializable {
	
	private static final long serialVersionUID = 3966897719903162558L;
	private Long idMedicamento;
	private String descricaoMedicamento;
	private Boolean statusMedicamento;
	private String observacoesMedicamento;
	private Long idPaciente;
	
	
	
	@Override
	public String toString() {
		return "Medicamento: " + descricaoMedicamento;
	}

	public MedicamentoDTO() {
	}

	public MedicamentoDTO(Long idMedicamento, String descricaoMedicamento, Boolean statusMedicamento,
			String observacoesMedicamento, Long idPaciente) {
		this.idMedicamento = idMedicamento;
		this.descricaoMedicamento = descricaoMedicamento;
		this.statusMedicamento = statusMedicamento;
		this.observacoesMedicamento = observacoesMedicamento;
		this.idPaciente = idPaciente;
	}

	public Long getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(Long idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getDescricaoMedicamento() {
		return descricaoMedicamento;
	}

	public void setDescricaoMedicamento(String descricaoMedicamento) {
		this.descricaoMedicamento = descricaoMedicamento;
	}

	public Boolean getStatusMedicamento() {
		return statusMedicamento;
	}

	public void setStatus_medicamento(Boolean statusMedicamento) {
		this.statusMedicamento = statusMedicamento;
	}

	public String getObservacoesMedicamento() {
		return observacoesMedicamento;
	}

	public void setObservacoesMedicamento(String observacoesMedicamento) {
		this.observacoesMedicamento = observacoesMedicamento;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

}
