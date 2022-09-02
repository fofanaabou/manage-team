package com.app.collaborators.repositories;

import com.app.collaborators.entities.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface CollaborateurRepository extends JpaRepository<Collaborateur, Long> {
    Optional<Collaborateur> findByEmail(String email);
}
