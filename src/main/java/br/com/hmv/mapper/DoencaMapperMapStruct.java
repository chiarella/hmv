package br.com.hmv.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.hmv.dto.DoencaDTO;
import br.com.hmv.entity.Doenca;

@Mapper(componentModel = "spring", uses = {PacienteMapperMP.class})
//@Mapper(uses = {DoencaMapper.class})
public interface DoencaMapperMapStruct {
	
	DoencaMapperMapStruct INSTANCE = Mappers.getMapper(DoencaMapperMapStruct.class);

	//@Mapping(target = "paciente.id", source = "pacienteId")
	//@Mapping(target = "paciente.id", ignore = true)
	//@Mapping(target = "paciente.id", source = "pacienteId")
//	Doenca doencaDTOToDoenca(DoencaDTO doencaDTO);

	List<Doenca> listDomain(List<DoencaDTO> doencaDTO);
	
	
}

