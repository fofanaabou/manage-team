package com.app.projects.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.app.projects.dto.ProjectDTO;
import org.apache.commons.lang3.Validate;
import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import com.app.projects.domain.Project;
import com.app.projects.mapper.ProjectMapper;
import com.app.projects.repositories.ProjectRepository;
import com.google.common.collect.Lists;
import com.netflix.servo.util.Strings;

@Service
public class ProjectServiceImpl implements ProjectService {

	private final ProjectRepository projectRepository;

	private final ProjectMapper projectMapper;

	public ProjectServiceImpl(
			ProjectRepository projectRepository,
			ProjectMapper projectMapper) {
		this.projectRepository = projectRepository;
		this.projectMapper = projectMapper;
	}

	@Override
	public List<ProjectDTO> findAll(String name) {
		List<ProjectDTO> projects = Lists.newArrayList();
		if(Strings.isNullOrEmpty(name)) {
			projects = projectRepository.findAll()
					.stream()
					.map(projectMapper::toDto)
					.collect(Collectors.toUnmodifiableList());
		} else {
			projects = projectRepository.findByName(name)
					.stream()
					.map(projectMapper::toDto)
					.collect(Collectors.toUnmodifiableList());
		}
		return projects;
	}

	@Override
	public ProjectDTO findById(Long projectId) {
		return projectRepository.findById(projectId)
				.map(projectMapper::toDto)
				.orElseThrow(RuntimeException::new);
	}

	@Override
	public ProjectDTO save(ProjectDTO projectDto) {
		Validate.notNull(projectDto, "Project to create should be set.");
		Project saveProject = projectRepository.save(projectMapper.toObject(projectDto));
		return projectMapper.toDto(saveProject);
	}

    @Override
    public void delete(ProjectDTO projectDto) {

        projectRepository.delete(projectMapper.toObject(projectDto));

    }

	@Override
	public ProjectDTO update(Long id, ProjectDTO projectDto) {
		Validate.notNull(projectDto, "Project to update should be set.");
		// TODO: we need to customize the returned exception
		if (!id.equals(projectDto.getId())) {
			throw new IllegalArgumentException(
					"The id in path is not equal payload's one, please check the entered information.");
		}
		Optional.ofNullable(projectRepository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException(id, projectDto.getName())));
		Project saveProject = projectRepository.save(projectMapper.toObject(projectDto));
		return projectMapper.toDto(saveProject);
	}

    @Override
    public void deleteById(Long id) {
        projectRepository.deleteById(id);
    }
}
