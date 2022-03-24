package br.com.hmv.dto;

import java.time.LocalDateTime;

public class AgendaDTO {

	private Long idAgenda;
	private LocalDateTime dataConsulta;
	private String horaConsultaInicial;
	private String horaConsultaFinal;
	private Long idPaciente;

	public AgendaDTO() {
	}

	public AgendaDTO(Long idAgenda, LocalDateTime dataConsulta, String horaConsultaInicial, String horaConsultaFinal,
			Long idPaciente) {
		this.idAgenda = idAgenda;
		this.dataConsulta = dataConsulta;
		this.horaConsultaInicial = horaConsultaInicial;
		this.horaConsultaFinal = horaConsultaFinal;
		this.idPaciente = idPaciente;
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

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

}
