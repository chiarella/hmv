package br.com.hmv.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.hmv.dto.AgendaDTO;
import br.com.hmv.entity.Agenda;

@Component
public class AgendaMapperManual {

	public Agenda agendaDtoToAgendaDomain(AgendaDTO dto) {
		Agenda agenda = new Agenda();
		agenda.setIdAgenda(dto.getIdAgenda());
		agenda.setDataConsulta(dto.getDataConsulta());
		agenda.setHoraConsultaInicial(dto.getHoraConsultaInicial());
		agenda.setHoraConsultaFinal(dto.getHoraConsultaFinal());
		return agenda;
	}

	public AgendaDTO agendaDomainToAgendaDto(Agenda domain) {
		AgendaDTO agendaDto = new AgendaDTO();
		agendaDto.setIdAgenda(domain.getIdAgenda());
		agendaDto.setDataConsulta(domain.getDataConsulta());
		agendaDto.setHoraConsultaInicial(domain.getHoraConsultaInicial());
		agendaDto.setHoraConsultaFinal(domain.getHoraConsultaFinal());

		agendaDto.setIdPaciente(domain.getPaciente().getId());
		return agendaDto;

	}

	public List<AgendaDTO> listAgendaDomainToListAgendaDto(List<Agenda> domains) {
		List<AgendaDTO> listAgendaDtos = new ArrayList<>();
		for (Agenda agenda : domains) {
			AgendaDTO agendaDto = this.agendaDomainToAgendaDto(agenda);
			listAgendaDtos.add(agendaDto);
			
		}
		return listAgendaDtos;
	}

}
