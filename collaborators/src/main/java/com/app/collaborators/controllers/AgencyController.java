package com.app.collaborators.controllers;

import com.app.collaborators.dto.AgencyDTO;
import com.app.collaborators.services.AgencyService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/agencies")
public class AgencyController {

    private final AgencyService agencyService;

    public AgencyController(AgencyService agencyService) {

        this.agencyService = agencyService;
    }

    @GetMapping
    public List<AgencyDTO> listOfAgency(){

        return agencyService.findAll()
                .stream()
                .sorted(AgencyDTO::compareTo)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public AgencyDTO getAgencyById(@PathVariable Long id){

        return agencyService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AgencyDTO saveAgency(@RequestBody AgencyDTO agencyDTO){

        return agencyService.save(agencyDTO);
    }

    @PutMapping("/{id}")
    public AgencyDTO updateAgency(@PathVariable Long id, @RequestBody AgencyDTO agencyDTO){
        return agencyService.update(id, agencyDTO);
    }

    @DeleteMapping("/{id}")
    public String deleteAgency(@PathVariable("id") Long id){

        agencyService.deleteById(id);

        return "Deleted successful";
    }


}
