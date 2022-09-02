package com.app.projects.repositories;

import com.app.projects.domain.Priority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PriorityRepository extends JpaRepository<Priority, Long> {
}
