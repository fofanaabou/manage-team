package com.app.affectation.service;


import com.app.affectation.dto.MissionDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MissionService {

    List<MissionDTO> findAll();

    MissionDTO findById(Long id);

    MissionDTO save(MissionDTO missionDTO);

    void delete(Long id);

    MissionDTO update(Long id, MissionDTO missionDTO);
}
