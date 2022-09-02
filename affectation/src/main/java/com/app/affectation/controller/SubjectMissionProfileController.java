package com.app.affectation.controller;


import com.app.affectation.dto.SubjectMissionProfileDTO;
import com.app.affectation.service.SubjectMissionProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/subject-mission-profiles")
public class SubjectMissionProfileController {

    private final SubjectMissionProfileService subjectMissionProfileService;

    public SubjectMissionProfileController(SubjectMissionProfileService subjectMissionProfileService) {
        this.subjectMissionProfileService = subjectMissionProfileService;
    }


    @GetMapping
    public List<SubjectMissionProfileDTO> list(){

        return subjectMissionProfileService.findAll();
    }

    @GetMapping("/{id}")
    public SubjectMissionProfileDTO findById(@PathVariable Long id){

        return subjectMissionProfileService.findById(id);
    }

    @PostMapping
    public SubjectMissionProfileDTO save(@RequestBody SubjectMissionProfileDTO subjectMissionProfileDTO){

        return subjectMissionProfileService.save(subjectMissionProfileDTO);
    }

    @PutMapping("/{id}")
    public SubjectMissionProfileDTO update(@PathVariable Long id, @RequestBody SubjectMissionProfileDTO subjectMissionProfileDTO){

        return subjectMissionProfileService.update(id, subjectMissionProfileDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){

        subjectMissionProfileService.delete(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
