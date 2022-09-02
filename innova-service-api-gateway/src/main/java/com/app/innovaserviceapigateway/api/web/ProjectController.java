package com.app.innovaserviceapigateway.api.web;

import com.app.innovaserviceapigateway.api.application.ProjectServiceClient;
import com.app.innovaserviceapigateway.api.model.project.Project;
import com.app.innovaserviceapigateway.api.model.project.Subject;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/gateway")
@CrossOrigin("http://localhost:4200")
public class ProjectController {

    private final ProjectServiceClient projectServiceClient;

    @GetMapping("/subjects")
    public List<Subject> getSubject(){
        return projectServiceClient.getSubjects();
    }

    @GetMapping("/projects")
    public List<Project> getProjects(){
        return projectServiceClient.getProjects();
    }
}
