package com.app.projects.mapper;


import com.app.projects.domain.Status;
import com.app.projects.dto.StatusDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StatusMapper {
    StatusMapper INSTANCE = Mappers.getMapper(StatusMapper.class);

    StatusDTO statutToStatutDto(Status status);

    StatusDTO statutDtoToStatut(StatusDTO statusDTO);
}
