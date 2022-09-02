package com.app.innovaserviceapigateway.api.application;

import com.app.innovaserviceapigateway.api.model.affectation.Profile;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequiredArgsConstructor
@Component
public class AffectationServiceClient {

    private final RestTemplate restTemplate;

    public List<Profile> getProfiles(){

        ResponseEntity<List<Profile>> responseEntity = restTemplate.exchange(
                "http://affectation/api/profiles",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });
        return responseEntity.getBody();
    }
}
