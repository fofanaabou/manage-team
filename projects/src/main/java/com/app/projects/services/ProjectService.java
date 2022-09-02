package com.app.projects.services;

import com.app.projects.dto.ProjectDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {

	List<ProjectDTO> findAll(String name);

	ProjectDTO findById(Long projectId);

	ProjectDTO save(ProjectDTO projectDto);

	void deleteById(Long id);

	void delete(ProjectDTO projectDto);

	ProjectDTO update(Long id, ProjectDTO projectDto);
}
