package com.app.collaborators.services;

import com.app.collaborators.dto.CollaboratorDTO;

import java.util.List;

public interface CollaboratorService {

    CollaboratorDTO saveCollaborateur (CollaboratorDTO p);
    void deleteCollaborateurById(Long id);
    CollaboratorDTO findByEmail(String email);
    CollaboratorDTO findById(Long id);
    List<CollaboratorDTO> getAllCollaborateur();
    CollaboratorDTO updateCollab(Long id, CollaboratorDTO collaboratorDTO);





}
