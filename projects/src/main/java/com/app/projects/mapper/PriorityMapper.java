package com.app.projects.mapper;

import com.app.projects.domain.Priority;
import com.app.projects.dto.PriorityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PriorityMapper {

    PriorityMapper INSTANCE = Mappers.getMapper(PriorityMapper.class);

    Priority toDTO(Priority priority);

    Priority toObject(PriorityDTO priorityDto);
}
