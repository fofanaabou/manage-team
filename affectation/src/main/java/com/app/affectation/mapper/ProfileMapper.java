package com.app.affectation.mapper;

import com.app.affectation.domain.Profile;
import com.app.affectation.dto.ProfileDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProfileMapper {

    ProfileMapper INSTANCE = Mappers.getMapper(ProfileMapper.class);

    ProfileDTO toDTO(Profile profile);

    Profile toObject(ProfileDTO profileDTO);
}
