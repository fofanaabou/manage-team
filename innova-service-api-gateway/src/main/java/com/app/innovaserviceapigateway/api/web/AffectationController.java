package com.app.innovaserviceapigateway.api.web;


import com.app.innovaserviceapigateway.api.application.AffectationServiceClient;
import com.app.innovaserviceapigateway.api.model.affectation.Profile;
import com.app.innovaserviceapigateway.api.model.project.Project;
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
public class AffectationController {

    private final AffectationServiceClient affectationServiceClient;

    @GetMapping("/profiles")
    public List<Profile> getProjects(){
        return affectationServiceClient.getProfiles();
    }
}
