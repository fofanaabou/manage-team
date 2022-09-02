package com.app.projects.controllers;

import com.app.projects.dto.ProfileEligibleDTO;
import com.app.projects.services.ProfileEligibleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/profile-eligibles")
public class PrEgController {

    private final ProfileEligibleService profileEligibleService;


    public PrEgController(ProfileEligibleService profileEligibleService) {
        this.profileEligibleService = profileEligibleService;
    }

    @GetMapping
    public List<ProfileEligibleDTO> list(){

        return profileEligibleService.findAll();
    }

    @GetMapping("/profile-sujet")
    public ProfileEligibleDTO findById(@RequestParam Long profileId, @RequestParam Long sujetId) {

        return profileEligibleService.findByProfileIdAndSubject(profileId,sujetId);
    }

    @PostMapping("/create")
    public ProfileEligibleDTO create(@RequestBody ProfileEligibleDTO profileEligibleDto){

        return profileEligibleService.save(profileEligibleDto);
    }

    @PutMapping("/{id}")
    public ProfileEligibleDTO update(@PathVariable Long id, @RequestBody ProfileEligibleDTO profileEligibleDto){

        return profileEligibleService.update(id, profileEligibleDto);
    }

}
