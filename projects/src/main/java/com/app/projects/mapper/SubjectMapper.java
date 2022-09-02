package com.app.projects.mapper;


import com.app.projects.domain.Subject;
import com.app.projects.dto.SubjectDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectMapper {

    SubjectMapper INSTANCE = Mappers.getMapper(SubjectMapper.class);

    SubjectDTO sujetToSujetDto(Subject subject);

    Subject sujetDtoToSujet(SubjectDTO subjectDTO);
}
