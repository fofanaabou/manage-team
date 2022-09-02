package com.app.collaborators.dto;

import com.app.collaborators.entities.Collaborateur;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CollaboratorDTO {

    private Long id;
    private AgencyDTO agence;
    private CategoryDTO category;
    private  String nom;
    private String prenom;
    private String email;
    private  String telephone;
    private LocalDate date_debut_carriere;
    private  String urlCv;
    private CollaboratorDTO manager;
    private List<CollaboratorProfileDTO> collaboratorProfiles;

}
