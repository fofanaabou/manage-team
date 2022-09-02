package com.app.collaborators.services;

import com.app.collaborators.dto.CollaboratorDTO;
import com.app.collaborators.dto.CollaboratorProfileDTO;
import com.app.collaborators.entities.Collaborateur;
import com.app.collaborators.entities.CollaboratorProfile;
import com.app.collaborators.mappers.CollaborateurMapper;
import com.app.collaborators.mappers.CollaboratorProfileMapper;
import com.app.collaborators.repositories.CollaborateurRepository;
import com.app.collaborators.repositories.CollaboratorProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CollaboratorServiceImpl implements CollaboratorService{

    //import du repos
    public final CollaborateurRepository collaborateurRepository;

    public final CollaboratorProfileRepository collaboratorProfileRepository;
    public final CollaborateurMapper collaborateurMapper;
    public final CollaboratorProfileMapper collaboratorProfileMapper;

    @Override
    public CollaboratorDTO saveCollaborateur(CollaboratorDTO collaboratorDTO) {

        // get list of collaborator profiles form collaborator dto
        List<CollaboratorProfileDTO> collaboratorProfileDTO = collaboratorDTO.getCollaboratorProfiles();

        // convert and save collaborator
        Collaborateur savedCollaborator = collaborateurRepository.save(collaborateurMapper.collaborateurDtoToCollaborateur(collaboratorDTO));

        // collaborator profiles and set on collaborator
      savedCollaborator.setCollaboratorProfiles(collaboratorProfileRepository.saveAll(collaboratorProfileDTO.stream()
                .map(collaboratorProfileMapper::toObject)
                .map(collaboratorProfile -> {
                    collaboratorProfile.setCollaborateur(savedCollaborator);
                    return collaboratorProfile;
                })
                .collect(Collectors.toList())));

        return collaborateurMapper.collaborateurToCollaborateurDto(savedCollaborator);

    }
    @Override
    public void deleteCollaborateurById(Long id) {
        collaborateurRepository.deleteById(id);

    }

    @Override
    public CollaboratorDTO findById(@PathVariable Long id) {
        return collaborateurRepository.findById(id)
                .map(collaborateurMapper::collaborateurToCollaborateurDto)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public List<CollaboratorDTO> getAllCollaborateur() {
        return collaborateurRepository.findAll()
                .stream()
                .map(collaborateurMapper::collaborateurToCollaborateurDto)
                .collect(Collectors.toList());
    }

    @Override
    public CollaboratorDTO updateCollab(Long id, CollaboratorDTO collaboratorDTO) {
        Collaborateur collab = collaborateurMapper.collaborateurDtoToCollaborateur(collaboratorDTO);
        collab.setId(id);
        return saveAndReturnDTO(collab);
    }

    @Override
    public CollaboratorDTO findByEmail (String email) {
        return collaborateurRepository.findByEmail(email)
                .map(collaborateurMapper::collaborateurToCollaborateurDto)
                .orElseThrow(RuntimeException::new);
    }

    private CollaboratorDTO saveAndReturnDTO(Collaborateur collab){
        Collaborateur saveCollab = collaborateurRepository.save(collab);
        return collaborateurMapper.collaborateurToCollaborateurDto(saveCollab);
    }

}
