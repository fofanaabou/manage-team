package com.app.collaborators.mappers;

import com.app.collaborators.dto.CollaboratorDTO;
import com.app.collaborators.entities.Collaborateur;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CollaborateurMapper {

    CollaborateurMapper collaborateurMapper = Mappers.getMapper(CollaborateurMapper.class);

    CollaboratorDTO collaborateurToCollaborateurDto (Collaborateur collaborateur);
    Collaborateur collaborateurDtoToCollaborateur (CollaboratorDTO collaboratorDTO);
}
