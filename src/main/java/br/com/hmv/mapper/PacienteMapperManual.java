package br.com.hmv.mapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.hmv.dto.AgendaDTO;
import br.com.hmv.dto.DoencaDTO;
import br.com.hmv.dto.ExameDTO;
import br.com.hmv.dto.HabitoDTO;
import br.com.hmv.dto.MedicamentoDTO;
import br.com.hmv.dto.PacienteDTO;
import br.com.hmv.dto.QuizDTO;
import br.com.hmv.dto.ResponsavelDTO;
import br.com.hmv.entity.Agenda;
import br.com.hmv.entity.Doenca;
import br.com.hmv.entity.Exame;
import br.com.hmv.entity.Habito;
import br.com.hmv.entity.Medicamento;
import br.com.hmv.entity.Paciente;
import br.com.hmv.entity.Quiz;
import br.com.hmv.entity.Responsavel;

@Component
public class PacienteMapperManual {

	// toDomain
	public Paciente pacienteDtoToPacienteDomain(PacienteDTO dto) {

		Paciente paciente = new Paciente();
		paciente.setId(dto.getId());
		paciente.setNomePaciente(dto.getNomePaciente());
		paciente.setSobrenomePaciente(dto.getSobrenomePaciente());
		paciente.setEmailPaciente(dto.getEmailPaciente());
		paciente.setCpf(dto.getCpf());
		paciente.setEnderecoRua(dto.getEnderecoRua());
		paciente.setEnderecoNro(dto.getEnderecoRua());
		paciente.setEnderecoComplemento(dto.getEnderecoComplemento());
		paciente.setEnderecoBairro(dto.getEnderecoBairro());
		paciente.setEnderecoCidade(dto.getEnderecoCidade());
		paciente.setEnderecoUF(dto.getEnderecoUF());
		paciente.setEnderecoCep(dto.getEnderecoCep());
		paciente.setTelefoneFixoPaciente(dto.getTelefoneFixoPaciente());
		paciente.setTelefoneCelPaciente(dto.getTelefoneCelPaciente());
		paciente.setIdadePaciente(dto.getIdadePaciente());
		paciente.setObservacoesPaciente(dto.getObservacoesPaciente());
		paciente.setConvenio(dto.getConvenio());
		paciente.setNumeroCarteirinha(dto.getNumeroCarteirinha());

		List<Doenca> listDoenca = new ArrayList<>();
		for (DoencaDTO doencaDto : dto.getDoencas()) {
			Doenca doenca = this.doencaDtoToDoencaDomain(doencaDto);
			doenca.setPaciente(paciente);
			listDoenca.add(doenca);
		}

		List<Exame> listExame = new ArrayList<>();
		for (ExameDTO exameDto : dto.getExames()) {
			Exame exame = this.exameDtoToExameDomain(exameDto);
			exame.setPaciente(paciente);
			listExame.add(exame);
		}

		List<Responsavel> listResponsavel = new ArrayList<>();
		for (ResponsavelDTO responsavelDTO : dto.getResponsaveis()) {
			Responsavel responsavel = this.responsavelDtoToResponsavelDomain(responsavelDTO);
			responsavel.setPaciente(paciente);
			listResponsavel.add(responsavel);
		}
		
		List<Medicamento> listMedicamento = new ArrayList<>();
		for (MedicamentoDTO medicamentoDTO : dto.getMedicamentos()) {
			Medicamento medicamento = this.medicamentoDtoToMedicamentoDomain(medicamentoDTO);
			medicamento.setPaciente(paciente);
			listMedicamento.add(medicamento);			
		}
		
		List<Habito> listHabito = new ArrayList<>();
		for (HabitoDTO habitoDTO : dto.getHabitos()) {
			Habito habito = this.habitoDtoToHabitoDomain(habitoDTO);
			habito.setPaciente(paciente);
			listHabito.add(habito);			
		}
		
		
		List<Agenda> listAgenda = new ArrayList<Agenda>();
		for(AgendaDTO agendaDTO :  dto.getAgendas()) {
			Agenda agenda = this.agendaDtoToAgendaDomain(agendaDTO);
			agenda.setPaciente(paciente);
			listAgenda.add(agenda);
		}
		
		List<Quiz> listQuizSintoma = new ArrayList<>();
		for (QuizDTO quizSintomaDTO : dto.getQuiz()) {
			Quiz quizSintoma = this.quizDtoToQuizDomain(quizSintomaDTO);
			quizSintoma.setPaciente(paciente);
			listQuizSintoma.add(quizSintoma);
		}

		paciente.setDoencas(listDoenca);
		paciente.setExames(listExame);
		paciente.setResponsaveis(listResponsavel);
		paciente.setMedicamentos(listMedicamento);
		paciente.setHabitos(listHabito);
		paciente.setAgendas(listAgenda);
		paciente.setQuiz(listQuizSintoma);

	return paciente;
	}


	// toDomain
	public Doenca doencaDtoToDoencaDomain(DoencaDTO dto) {
		Doenca domain = new Doenca();
		domain.setIdDoenca(dto.getIdDoenca());
		domain.setDescricaoDoenca(dto.getDescricaoDoenca());
		return domain;
	}

	private Exame exameDtoToExameDomain(ExameDTO exameDto) {
		Exame domain = new Exame();
		domain.setId(exameDto.getIdExame());
		domain.setDescricaoExame(exameDto.getDescricaoExame());
		domain.setTipoExame(exameDto.getTipoExame());
		domain.setObersavacaoExame(exameDto.getObservacaoExame());
		return domain;
	}

	private Responsavel responsavelDtoToResponsavelDomain(ResponsavelDTO responsavelDTO) {
		Responsavel domain = new Responsavel();
		domain.setIdResponsavel(responsavelDTO.getIdResponsavel());
		domain.setNomeResponsavel(responsavelDTO.getNomeResponsavel());
		domain.setSobrenomeResponsavel(responsavelDTO.getSobrenomeResponsavel());
		domain.setParentescoResponsavel(responsavelDTO.getParentescoResponsavel());
		domain.setEmailResponsavel(responsavelDTO.getEmailResponsavel());
		domain.setTelefoneFixoResponsavel(responsavelDTO.getTelefoneFixoResponsavel());
		domain.setTelefoneCelresponsavel(responsavelDTO.getTelefoneCelresponsavel());
		domain.setObservacoesResponsavel(responsavelDTO.getObservacoesResponsavel());
		return domain;
	}

	private Medicamento medicamentoDtoToMedicamentoDomain(MedicamentoDTO medicamentoDTO) {
		Medicamento domain = new Medicamento();
		domain.setIdMedicamento(medicamentoDTO.getIdMedicamento());
		domain.setDescricaoMedicamento(medicamentoDTO.getDescricaoMedicamento());
		domain.setStatusMedicamento(medicamentoDTO.getStatusMedicamento());
		domain.setObservacoesMedicamento(medicamentoDTO.getObservacoesMedicamento());
		return domain;
	}
	
	private Habito habitoDtoToHabitoDomain(HabitoDTO habitoDTO) {
		Habito domain = new Habito();
		domain.setIdHabito(habitoDTO.getIdPaciente());
		domain.setDescricaoHabito(habitoDTO.getDescricaoHabito());
		domain.setStatusHabito(habitoDTO.getStatusHabito());
		return domain;
	}
	
	private Agenda agendaDtoToAgendaDomain(AgendaDTO agendaDTO) {
		Agenda domain = new Agenda();
		domain.setIdAgenda(agendaDTO.getIdAgenda());
		domain.setDataConsulta(agendaDTO.getDataConsulta());
		domain.setHoraConsultaInicial(agendaDTO.getHoraConsultaInicial());
		domain.setHoraConsultaFinal(agendaDTO.getHoraConsultaFinal());
		return domain;
	}
		

	private Quiz quizDtoToQuizDomain(QuizDTO quizDTO) {
		Quiz domain = new Quiz();
		domain.setIdQuiz(quizDTO.getIdQuiz());
		domain.setDescricaoQuiz(quizDTO.getDescricaoQuiz());
		domain.setStatusQuiz(quizDTO.getStatusQuiz());
		domain.setDataQuiz(LocalDateTime.now());
		return domain;
	}	
	
	public List<Paciente> listPacienteDtoToListPacienteDomain(List<PacienteDTO> listDto) {
		List<Paciente> listPaciente = new ArrayList<>();
		for (PacienteDTO pacienteDto : listDto) {
			Paciente paciente = this.pacienteDtoToPacienteDomain(pacienteDto);
			listPaciente.add(paciente);
		}
		return listPaciente;
	}

	public PacienteDTO pacienteDomainToPacienteDto(Paciente domain) {
		PacienteDTO pacienteDto = new PacienteDTO();
		pacienteDto.setId(domain.getId());
		pacienteDto.setNomePaciente(domain.getNomePaciente());
		pacienteDto.setSobrenomePaciente(domain.getSobrenomePaciente());
		pacienteDto.setEmailPaciente(domain.getEmailPaciente());
		pacienteDto.setCpf(domain.getCpf());
		pacienteDto.setEnderecoRua(domain.getEnderecoRua());
		pacienteDto.setEnderecoNro(domain.getEnderecoNro());
		pacienteDto.setEnderecoComplemento(domain.getEnderecoComplemento());
		pacienteDto.setEnderecoBairro(domain.getEnderecoBairro());
		pacienteDto.setEnderecoCidade(domain.getEnderecoCidade());
		pacienteDto.setEnderecoUF(domain.getEnderecoUF());
		pacienteDto.setEnderecoCep(domain.getEnderecoCep());
		pacienteDto.setTelefoneFixoPaciente(domain.getTelefoneFixoPaciente());
		pacienteDto.setTelefoneCelPaciente(domain.getTelefoneCelPaciente());
		pacienteDto.setIdadePaciente(domain.getIdadePaciente());
		pacienteDto.setObservacoesPaciente(domain.getObservacoesPaciente());
		pacienteDto.setConvenio(domain.getConvenio());
		pacienteDto.setNumeroCarteirinha(domain.getNumeroCarteirinha());

		List<DoencaDTO> listDoenca = new ArrayList<>();
		for (Doenca doenca : domain.getDoencas()) {
			DoencaDTO doencaDTO = this.doencaDomainToDoencaDTO(doenca);
			// doencaDTO.setId(pacienteDto.getId());
			doencaDTO.setIdPaciente(pacienteDto.getId());
			listDoenca.add(doencaDTO);
		}
		pacienteDto.setDoencas(listDoenca);

		List<ExameDTO> listExame = new ArrayList<>();
		for (Exame exame : domain.getExames()) {
			ExameDTO exameDTO = this.exameDomainToDoencaDTO(exame);
			exameDTO.setIdPaciente(pacienteDto.getId());
			listExame.add(exameDTO);
		}
		pacienteDto.setExames(listExame);

		List<ResponsavelDTO> listResponsavel = new ArrayList<>();
		for (Responsavel responsavel : domain.getResponsaveis()) {
			ResponsavelDTO responsavelDTO = this.responsavelDomainToResponsavelDTO(responsavel);
			responsavelDTO.setIdPaciente(pacienteDto.getId());
			listResponsavel.add(responsavelDTO);
		}
		pacienteDto.setResponsaveis(listResponsavel);
		
		List<MedicamentoDTO> listMedicamento = new ArrayList<>();
		for (Medicamento medicamento: domain.getMedicamentos()) {
			MedicamentoDTO medicamentoDTO = this.medicamentoDomainToMedicamentoDTO(medicamento);
			medicamentoDTO.setIdPaciente(pacienteDto.getId());
			listMedicamento.add(medicamentoDTO);
		}
		pacienteDto.setMedicamentos(listMedicamento);
		
		List<HabitoDTO> listHabito = new ArrayList<>();
		for (Habito habito: domain.getHabitos()) {
			HabitoDTO habitoDTO = this.habitoDomainToHabitoDTO(habito);
			habitoDTO.setIdPaciente(pacienteDto.getId());
			listHabito.add(habitoDTO);
		}
		pacienteDto.setHabitos(listHabito);
		
		List<AgendaDTO> listAgenda = new ArrayList<>();
		for (Agenda agenda: domain.getAgendas()) {
			AgendaDTO agendaDTO = this.agendaDomainToAgendaDTO(agenda);
			agendaDTO.setIdPaciente(pacienteDto.getId());
			listAgenda.add(agendaDTO);
		}
		pacienteDto.setAgendas(listAgenda);
		
		List<QuizDTO> listQuizSintoma = new ArrayList<>();
		for (Quiz quizSintoma: domain.getQuiz()) {
			QuizDTO quizSintomaDTO = this.quizDomainToQuizDTO(quizSintoma);
			quizSintomaDTO.setIdPaciente(pacienteDto.getId());
			listQuizSintoma.add(quizSintomaDTO);
		}
		pacienteDto.setQuizSintomas(listQuizSintoma);
		
		return pacienteDto;
	}



	private DoencaDTO doencaDomainToDoencaDTO(Doenca domain) {
		DoencaDTO doencaDto = new DoencaDTO();
		doencaDto.setIdDoenca(domain.getIdDoenca());
		doencaDto.setDescricaoDoenca(domain.getDescricaoDoenca());
		return doencaDto;
	}

	private ExameDTO exameDomainToDoencaDTO(Exame domain) {
		ExameDTO exameDto = new ExameDTO();
		exameDto.setIdExame(domain.getId());
		exameDto.setDescricaoExame(domain.getDescricaoExame());
		exameDto.setObservacaoExame(domain.getObersavacaoExame());
		exameDto.setTipoExame(domain.getTipoExame());
		return exameDto;
	}

	private ResponsavelDTO responsavelDomainToResponsavelDTO(Responsavel domain) {
		ResponsavelDTO responsavelDTO = new ResponsavelDTO();
		responsavelDTO.setIdResponsavel(domain.getIdResponsavel());
		responsavelDTO.setNomeResponsavel(domain.getNomeResponsavel());
		responsavelDTO.setSobrenomeResponsavel(domain.getSobrenomeResponsavel());
		responsavelDTO.setParentescoResponsavel(domain.getParentescoResponsavel());
		responsavelDTO.setEmailResponsavel(domain.getEmailResponsavel());
		responsavelDTO.setTelefoneFixoResponsavel(domain.getTelefoneFixoResponsavel());
		responsavelDTO.setTelefoneCelresponsavel(domain.getTelefoneCelResponsavel());
		responsavelDTO.setObservacoesResponsavel(domain.getObservacoesResponsavel());
		return responsavelDTO;
	}
	
	private MedicamentoDTO medicamentoDomainToMedicamentoDTO(Medicamento domain) {
		MedicamentoDTO medicamentoDTO = new MedicamentoDTO();
		medicamentoDTO.setIdMedicamento(domain.getIdMedicamento());
		medicamentoDTO.setDescricaoMedicamento(domain.getDescricaoMedicamento());
		medicamentoDTO.setStatus_medicamento(domain.getStatusMedicamento());
		medicamentoDTO.setObservacoesMedicamento(domain.getObservacoesMedicamento());
		return medicamentoDTO;
	}
	
	private HabitoDTO habitoDomainToHabitoDTO(Habito domain) {
		HabitoDTO habitoDTO = new HabitoDTO();
		habitoDTO.setIdHabito(domain.getIdHabito());
		habitoDTO.setDescricaoHabito(domain.getDescricaoHabito());
		habitoDTO.setStatusHabito(domain.getStatusHabito());
		return habitoDTO;
	}
	
	private AgendaDTO agendaDomainToAgendaDTO(Agenda domain) {
		AgendaDTO agendaDTO = new AgendaDTO();
		agendaDTO.setIdAgenda(domain.getIdAgenda());
		agendaDTO.setDataConsulta(domain.getDataConsulta());
		agendaDTO.setHoraConsultaInicial(domain.getHoraConsultaInicial());
		agendaDTO.setHoraConsultaFinal(domain.getHoraConsultaFinal());
		return agendaDTO;
	}
	
	private QuizDTO quizDomainToQuizDTO(Quiz domain) {
		QuizDTO quizSintomaDTO = new QuizDTO();
		quizSintomaDTO.setIdQuiz(domain.getIdQuiz());
		quizSintomaDTO.setDescricaoQuiz(domain.getDescricaoQuiz());
		quizSintomaDTO.setStatusQuiz(domain.getStatusQuiz());
		quizSintomaDTO.setDataQuiz(domain.getDataQuiz());
		return quizSintomaDTO;
	}

	public List<PacienteDTO> listPacienteDomainToListPacienteDto(List<Paciente> domains) {
		List<PacienteDTO> listPacienteDTOs = new ArrayList<>();
		for (Paciente paciente : domains) {
			PacienteDTO pacienteDto = this.pacienteDomainToPacienteDto(paciente);
			listPacienteDTOs.add(pacienteDto);
		}
		return listPacienteDTOs;
	}

}
