package com.app.affectation.mapper;

import com.app.affectation.domain.Mission;
import com.app.affectation.dto.MissionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MissionMapper {

    MissionMapper INSTANCE = Mappers.getMapper(MissionMapper.class);

    public MissionDTO toDTO(Mission mission);

    @Mapping(target = "subjectMissionProfile", ignore = true)
    public Mission toObject(MissionDTO missionDTO);
}
