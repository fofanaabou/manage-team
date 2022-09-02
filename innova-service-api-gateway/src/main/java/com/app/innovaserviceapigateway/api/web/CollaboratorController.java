package com.app.innovaserviceapigateway.api.web;

import com.app.innovaserviceapigateway.api.application.CollaboratorServiceClient;
import com.app.innovaserviceapigateway.api.model.collaborator.Agence;
import com.app.innovaserviceapigateway.api.model.collaborator.Category;
import com.app.innovaserviceapigateway.api.model.collaborator.Collaborator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/gateway")
@CrossOrigin("http://localhost:4200")
public class CollaboratorController {

    private final CollaboratorServiceClient collaboratorServiceClient;

    @GetMapping("/collaborators")
    public List<Collaborator> getProjects(){
        return collaboratorServiceClient.getCollaborators();
    }

    @GetMapping("/agencies")
    public List<Agence> getAgencies(){
        return collaboratorServiceClient.getAgencies();
    }

    @GetMapping("/categories")
    public List<Category> getCategories(){
        return collaboratorServiceClient.getCategories();
    }

    @PostMapping("/collaborators")
    public Collaborator save(@RequestBody Collaborator collaborator){
        return collaboratorServiceClient.saveCollaborator(collaborator);
    }
}