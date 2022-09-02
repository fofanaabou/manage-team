package com.app.projects.mapper;

import com.app.projects.domain.Duration;
import com.app.projects.dto.DurationDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DurationMapper {

    DurationMapper INSTANCE = Mappers.getMapper(DurationMapper.class);

    DurationDTO toDTO(Duration duration);

    Duration toObject(DurationDTO durationDto);
}
