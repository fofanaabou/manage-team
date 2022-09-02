package com.app.collaborators.controllers;

import com.app.collaborators.dto.CollaboratorDTO;
import com.app.collaborators.services.CollaboratorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/collaborators")
public class CollaboratorController {

    private final CollaboratorService collaboratorService;

    public CollaboratorController(CollaboratorService collaboratorService) {
        this.collaboratorService = collaboratorService;
    }

    //récupère la liste de tous les collaborateurs

    @GetMapping
    public List<CollaboratorDTO> listCollaborators(){
        return collaboratorService.getAllCollaborateur();
    }

    //récupère un collab à partir de son Id
    @GetMapping("/{id}")
    public CollaboratorDTO getById(@PathVariable Long id){

        return collaboratorService.findById(id);
    }

    //récupère un collab à partir de son email
    @GetMapping("/collab/{email}")
    public CollaboratorDTO getByName(@PathVariable String email){
        return collaboratorService.findByEmail(email);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CollaboratorDTO saveCollaborateur(@RequestBody CollaboratorDTO collabDto){

        return collaboratorService.saveCollaborateur(collabDto);
    }

    @PutMapping("/{id}")
    public CollaboratorDTO updateCollab(@PathVariable Long id, @RequestBody CollaboratorDTO collabDto){
        return collaboratorService.updateCollab(id, collabDto);
    }
    @DeleteMapping("/{id}")
    public String deleteCollaborateur(@PathVariable("id") Long id){

        collaboratorService.deleteCollaborateurById(id);

        return "Deleted successful";
    }


}
