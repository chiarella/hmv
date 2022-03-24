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
@Table(name = "tb_habito")
public class Habito implements Serializable {

	private static final long serialVersionUID = -5178768277143340265L;

	@Id
	@Column(name = "id_habito")
	@SequenceGenerator(name = "habito", sequenceName = "sq_tb_habito", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHabito;

	@Column(name = "descricao_habito")
	private String descricaoHabito;

	@Column(name = "status_habito")
	private Boolean statusHabito;

	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	public Habito() {
	}

	public Habito(Long idHabito, String descricaoHabito, Boolean statusHabito, Paciente paciente) {
		this.idHabito = idHabito;
		this.descricaoHabito = descricaoHabito;
		this.statusHabito = statusHabito;
		this.paciente = paciente;
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

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
