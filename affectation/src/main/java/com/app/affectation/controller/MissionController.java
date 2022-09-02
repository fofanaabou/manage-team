package com.app.affectation.controller;

import com.app.affectation.dto.MissionDTO;
import com.app.affectation.service.MissionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/missions")
public class MissionController {

    private final MissionService missionService;

    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    @GetMapping
    public List<MissionDTO> list(){

        return missionService.findAll();
    }

    @GetMapping("/{id}")
    public MissionDTO findById(@PathVariable Long id){

        return missionService.findById(id);
    }

    @PostMapping
    public MissionDTO save(@RequestBody MissionDTO missionDTO){

        return missionService.save(missionDTO);
    }

    @PutMapping("/{id}")
    public MissionDTO update(@PathVariable Long id, @RequestBody MissionDTO missionDTO){

        return missionService.update(id, missionDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){

        missionService.delete(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
