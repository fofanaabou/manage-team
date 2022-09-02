package com.app.affectation.mapper;

import com.app.affectation.domain.SubjectMissionProfile;
import com.app.affectation.dto.SubjectMissionProfileDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectMissionProfileMapper {

    SubjectMissionProfileMapper INSTANCE = Mappers.getMapper(SubjectMissionProfileMapper.class);

    SubjectMissionProfileDTO toDTO(SubjectMissionProfile subjectMissionProfile);

    SubjectMissionProfile toObject(SubjectMissionProfileDTO subjectMissionProfileDTO);
}
