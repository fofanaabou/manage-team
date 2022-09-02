package com.app.collaborators.mappers;

import com.app.collaborators.dto.AgencyDTO;
import com.app.collaborators.entities.Agence;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AgenceMapper {

    AgenceMapper agenceMapper = Mappers.getMapper(AgenceMapper.class);

    AgencyDTO agenceToAgenceDto (Agence agence);
    Agence agenceDtoToAgence (AgencyDTO agencyDTO);
}
