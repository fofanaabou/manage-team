package com.app.innovaserviceapigateway.api.application;

import com.app.innovaserviceapigateway.api.model.project.Project;
import com.app.innovaserviceapigateway.api.model.project.Subject;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProjectServiceClient {

    private  final String hostname = "http://projects/";

    private final RestTemplate restTemplate;

    public List<Subject> getSubjects(){

        ResponseEntity<List<Subject>> responseEntity = restTemplate.exchange(
                "http://projects/api/subjects",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });
        return responseEntity.getBody();
    }

    public List<Project> getProjects(){

        ResponseEntity<List<Project>> responseEntity = restTemplate.exchange(
                 "http://projects/api/projects",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });
        return responseEntity.getBody();
    }
}
