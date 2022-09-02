package com.app.projects.mapper;

import com.app.projects.domain.ProfileEligible;
import com.app.projects.dto.ProfileEligibleDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProfileEligibleMapper {

    ProfileEligibleMapper INSTANCE = Mappers.getMapper(ProfileEligibleMapper.class);

    ProfileEligibleDTO toDTO(ProfileEligible profileEligible);

    @Mapping(target = "subject", ignore = true)
    ProfileEligible toObject(ProfileEligibleDTO profileEligibleDto);
}
