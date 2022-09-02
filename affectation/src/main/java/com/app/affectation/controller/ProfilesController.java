package com.app.affectation.controller;

import com.app.affectation.dto.ProfileDTO;
import com.app.affectation.service.ProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/profiles")
public class ProfilesController {

    private final ProfileService profileService;

    public ProfilesController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    public List<ProfileDTO> list(){

        return profileService.findAll()
                .stream()
                .sorted(ProfileDTO::compareTo)
                .collect(Collectors.toList());
    }

    @PostMapping
    public ProfileDTO save(@RequestBody ProfileDTO profileDTO){

        return profileService.save(profileDTO);
    }

    @PutMapping("/{id}")
    public ProfileDTO update(@PathVariable Long id, @RequestBody ProfileDTO profileDTO){

        return profileService.update(id, profileDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){

        profileService.delete(id);

        return new ResponseEntity<>("Deleted Successful", HttpStatus.OK);
    }
}
