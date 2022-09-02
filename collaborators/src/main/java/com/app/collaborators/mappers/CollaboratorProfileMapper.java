package com.app.collaborators.mappers;

import com.app.collaborators.dto.CollaboratorProfileDTO;
import com.app.collaborators.entities.CollaboratorProfile;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CollaboratorProfileMapper {

    CollaboratorProfileMapper INSTANCE = Mappers.getMapper(CollaboratorProfileMapper.class);

    CollaboratorProfileDTO toDTO(CollaboratorProfile collaboratorProfile);

    CollaboratorProfile toObject(CollaboratorProfileDTO collaboratorProfileDTO);
}
