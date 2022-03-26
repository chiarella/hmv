package br.com.hmv.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.hmv.dto.DoencaDTO;
import br.com.hmv.dto.ExameDTO;
import br.com.hmv.dto.MedicamentoDTO;
import br.com.hmv.dto.PacienteRetornoQuizDTO;
import br.com.hmv.dto.QuizDTO;
import br.com.hmv.entity.Doenca;
import br.com.hmv.entity.Exame;
import br.com.hmv.entity.Medicamento;
import br.com.hmv.entity.Paciente;
import br.com.hmv.entity.Quiz;


@Component
public class PacienteMapperManualQuiz {
	
	public PacienteRetornoQuizDTO pacienteDomainToPacienteDto(Paciente domain) {
		PacienteRetornoQuizDTO pacienteDto = new PacienteRetornoQuizDTO();
		pacienteDto.setId(domain.getId());
		pacienteDto.setNomePaciente(domain.getNomePaciente());
		pacienteDto.setSobrenomePaciente(domain.getSobrenomePaciente());
		pacienteDto.setCpf(domain.getCpf());
		pacienteDto.setIdadePaciente(domain.getIdadePaciente());
		pacienteDto.setObservacoesPaciente(domain.getObservacoesPaciente());
		
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

		List<MedicamentoDTO> listMedicamento = new ArrayList<>();
		for (Medicamento medicamento: domain.getMedicamentos()) {
			MedicamentoDTO medicamentoDTO = this.medicamentoDomainToMedicamentoDTO(medicamento);
			medicamentoDTO.setIdPaciente(pacienteDto.getId());
			listMedicamento.add(medicamentoDTO);
		}
		pacienteDto.setMedicamentos(listMedicamento);
		
		
		List<QuizDTO> listQuizSintoma = new ArrayList<>();
		for (Quiz quizSintoma: domain.getQuiz()) {
			QuizDTO quizSintomaDTO = this.quizDomainToQuizDTO(quizSintoma);
			quizSintomaDTO.setIdPaciente(pacienteDto.getId());
			listQuizSintoma.add(quizSintomaDTO);
		}
		pacienteDto.setQuiz(listQuizSintoma);
						
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
	
	private MedicamentoDTO medicamentoDomainToMedicamentoDTO(Medicamento domain) {
		MedicamentoDTO medicamentoDTO = new MedicamentoDTO();
		medicamentoDTO.setIdMedicamento(domain.getIdMedicamento());
		medicamentoDTO.setDescricaoMedicamento(domain.getDescricaoMedicamento());
		medicamentoDTO.setStatus_medicamento(domain.getStatusMedicamento());
		medicamentoDTO.setObservacoesMedicamento(domain.getObservacoesMedicamento());
		return medicamentoDTO;
	}
	
	private QuizDTO quizDomainToQuizDTO(Quiz domain) {
		QuizDTO quizSintomaDTO = new QuizDTO();
		quizSintomaDTO.setIdQuiz(domain.getIdQuiz());
		quizSintomaDTO.setDescricaoQuiz(domain.getDescricaoQuiz());
		quizSintomaDTO.setStatusQuiz(domain.getStatusQuiz());
		quizSintomaDTO.setDataQuiz(domain.getDataQuiz());
		return quizSintomaDTO;
	}

}
