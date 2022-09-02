package com.app.projects.repositories;

import com.app.projects.domain.Duration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DurationRepository extends JpaRepository<Duration, Long> {
}
