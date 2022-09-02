package com.app.projects.controllers;

import java.util.List;

import com.app.projects.dto.ProjectDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.projects.services.ProjectService;

@RestController
@RequestMapping("api/projects")
public class ProjectController {

	private final ProjectService projectService;

	public ProjectController(ProjectService projectService) {
		this.projectService = projectService;
	}

	@GetMapping
	public List<ProjectDTO> listOfProjects(@RequestParam(required = false) String name) {
		return projectService.findAll(name);
	}

    @GetMapping("/{id}")
    public ProjectDTO projectById(@PathVariable Long id){

        return projectService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProjectDTO save(@RequestBody ProjectDTO projectDto){
        return projectService.save(projectDto);
    }

	@PutMapping("/{id}")
	public ProjectDTO update(
			@PathVariable Long id,
			@RequestBody ProjectDTO projectDto) {
		return projectService.update(id, projectDto);
	}

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProjectById(@PathVariable("id") Long id){

        projectService.deleteById(id);

        return new ResponseEntity<>("Deleted successful", HttpStatus.OK);
    }

}
