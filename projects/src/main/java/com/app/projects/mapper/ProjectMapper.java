package com.app.projects.mapper;

import com.app.projects.domain.Project;
import com.app.projects.dto.ProjectDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProjectMapper {

    ProjectMapper INSTANCE = Mappers.getMapper(ProjectMapper.class);

    ProjectDTO toDto(Project project);

    @Mapping(target = "subjects", ignore = true)
    Project toObject(ProjectDTO projectDto);

}
