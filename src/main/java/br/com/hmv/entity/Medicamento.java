package br.com.hmv.entity;

import java.io.Serializable;

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
@Table(name = "tb_medicamento")
public class Medicamento implements Serializable {

	private static final long serialVersionUID = -4799251412526652021L;

	@Id
	@Column(name = "id_medicamento")
	@SequenceGenerator(name = "medicamento", sequenceName = "sq_tb_medicamento",
	allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMedicamento;

	@Column(name = "descricao_medicamento")
	private String descricaoMedicamento;

	@Column(name = "status_medicamento")
	private Boolean statusMedicamento;

	@Column(name = "observacoes_medicamento")
	private String observacoesMedicamento;

	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	public Medicamento() {
	}

	public Medicamento(Long idMedicamento, String descricaoMedicamento, Boolean statusMedicamento,
			String observacoesMedicamento, Paciente paciente) {
		this.idMedicamento = idMedicamento;
		this.descricaoMedicamento = descricaoMedicamento;
		this.statusMedicamento = statusMedicamento;
		this.observacoesMedicamento = observacoesMedicamento;
		this.paciente = paciente;
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

	public void setStatusMedicamento(Boolean statusMedicamento) {
		this.statusMedicamento = statusMedicamento;
	}

	public String getObservacoesMedicamento() {
		return observacoesMedicamento;
	}

	public void setObservacoesMedicamento(String observacoesMedicamento) {
		this.observacoesMedicamento = observacoesMedicamento;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
