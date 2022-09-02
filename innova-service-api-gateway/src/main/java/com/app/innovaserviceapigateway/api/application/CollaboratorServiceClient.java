package com.app.innovaserviceapigateway.api.application;

import com.app.innovaserviceapigateway.api.model.collaborator.Agence;
import com.app.innovaserviceapigateway.api.model.collaborator.Category;
import com.app.innovaserviceapigateway.api.model.collaborator.Collaborator;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CollaboratorServiceClient {

    private final RestTemplate restTemplate;

    public List<Collaborator> getCollaborators(){

        ResponseEntity<List<Collaborator>> responseEntity = restTemplate.exchange(
                "http://collaborator/api/collaborators",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });
        return responseEntity.getBody();
    }

    public List<Agence> getAgencies(){

        ResponseEntity<List<Agence>> responseEntity = restTemplate.exchange(
                "http://collaborator/api/agencies",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });
        return responseEntity.getBody();
    }

    public List<Category> getCategories(){

        ResponseEntity<List<Category>> responseEntity = restTemplate.exchange(
                "http://collaborator/api/categories",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });
        return responseEntity.getBody();
    }


    public Collaborator saveCollaborator(Collaborator collaborator){

        HttpEntity<Collaborator> request = new HttpEntity<>(collaborator);
        ResponseEntity<Collaborator> responseEntity = restTemplate.exchange(
                "http://collaborator/api/collaborators",
                HttpMethod.POST,
                request,
                new ParameterizedTypeReference<>() {
                });
        return responseEntity.getBody();
    }

}
