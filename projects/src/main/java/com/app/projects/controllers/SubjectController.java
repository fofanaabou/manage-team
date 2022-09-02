package com.app.projects.controllers;

import com.app.projects.dto.SubjectDTO;
import com.app.projects.services.SubjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/subjects")
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public List<SubjectDTO> listOfSubject(){

        return subjectService.findAll();
    }

    @GetMapping("/{id}")
    public SubjectDTO findById(@PathVariable Long id){

        return subjectService.findByd(id);
    }

    @GetMapping("/subject/{title}")
    public SubjectDTO findByTitle(@PathVariable String title){

        return subjectService.findByTitle(title);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SubjectDTO save(@RequestBody SubjectDTO subjectDTO){

        return subjectService.save(subjectDTO);
    }

    @PutMapping("/{id}")
    public SubjectDTO update(@PathVariable Long id, @RequestBody SubjectDTO subjectDTO){

        return subjectService.update(id, subjectDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){

        subjectService.deleteById(id);

        return new ResponseEntity<>("Deleted Successful", HttpStatus.OK);
    }

}
