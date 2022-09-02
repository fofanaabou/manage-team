package com.app.collaborators.repositories;

import com.app.collaborators.entities.CollaboratorProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollaboratorProfileRepository extends JpaRepository<CollaboratorProfile, Long> {
}
