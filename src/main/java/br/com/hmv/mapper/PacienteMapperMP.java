package br.com.hmv.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import br.com.hmv.dto.DoencaDTO;
import br.com.hmv.dto.PacienteDTO;
import br.com.hmv.entity.Doenca;
import br.com.hmv.entity.Paciente;

//@Mapper(componentModel = "spring")
//@Mapper(uses = {PacienteMapper.class, DoencaMapper.class})
@Mapper(componentModel = "spring" , uses = {DoencaMapperMapStruct.class})
public interface PacienteMapperMP {
	
//	PacienteMapper INSTANCE = Mappers.getMapper(PacienteMapper.class);

//	@Mapping(target = "pacienteId", source = "paciente.id")
//	@Mapping(target = "doenca.paciente", ignore = true)
//	@Mapping(source = "id", target = "idPaciente")
//	@Mapping(source = "id", target = "doenca.pacienteId")	
//	@Mapping(source = "id", target = "idPaciente")
	Paciente toModel(PacienteDTO pacienteDTO);
	
//	@AfterMapping 
//	public void bindDoenca(PacienteDTO pacienteDTO, @MappingTarget Paciente paciente) {
//		paciente.setDoencas(DoencaMapper.INSTANCE.listDomain(pacienteDTO.getDoencas()));
//	}
//    @Mapping(target = "doencas", ignore = true)
//	@Mapping(source = "idPaciente", target = "id")
	PacienteDTO toDto(Paciente paciente);
	

	//List<PacienteDTO> listDomainToListDto(List<Paciente> paciente);
	List<PacienteDTO> toDtoList(List<Paciente> list);
	
	
//	@Mapping(target = "paciente.id" , source = "pacienteId")
	Doenca toModel(DoencaDTO doencaDTO);
//	//@Mapping(target = "paciente.id", source = "pacienteId")
////	@Mapping(source = "pacienteId", target = "paciente.id")
////	@Mapping(target = "pacienteId", source = "paciente")
////	@Mapping(target = "doencaDTO.pacienteId", source = "paciente")
//	Doenca doencaDTOToDoenca(DoencaDTO doencaDTO);
	
	
	
	

}
