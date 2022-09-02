package com.app.projects.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.projects.domain.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

	List<Project> findByName(String name);
}
