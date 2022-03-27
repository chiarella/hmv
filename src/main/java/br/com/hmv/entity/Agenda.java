package br.com.hmv.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@Table(name = "tb_agenda")
public class Agenda implements Serializable{

	private static final long serialVersionUID = -8102472025606022915L;

	@Id
	@SequenceGenerator(name = "agenda", 
	sequenceName = "sq_tb_agenda", 
	allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_agenda")
	private Long idAgenda;
	
	@Column(name = "dataConsulta")
	private LocalDateTime dataConsulta;
	
	@Column(name = "hora_consulta_inicial")
	private String horaConsultaInicial;
	
	@Column(name = "hora_consulta_final")
	private String horaConsultaFinal;

	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;
	
	public Agenda() {
	}

	public Agenda(Long idAgenda, LocalDateTime dataConsulta, String horaConsultaInicial, String horaConsultaFinal,
			Paciente paciente) {
		this.idAgenda = idAgenda;
		this.dataConsulta = dataConsulta;
		this.horaConsultaInicial = horaConsultaInicial;
		this.horaConsultaFinal = horaConsultaFinal;
		this.paciente = paciente;
	}

	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	public LocalDateTime getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(LocalDateTime dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getHoraConsultaInicial() {
		return horaConsultaInicial;
	}

	public void setHoraConsultaInicial(String horaConsultaInicial) {
		this.horaConsultaInicial = horaConsultaInicial;
	}

	public String getHoraConsultaFinal() {
		return horaConsultaFinal;
	}

	public void setHoraConsultaFinal(String horaConsultaFinal) {
		this.horaConsultaFinal = horaConsultaFinal;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}	

}
