package com.app.collaborators.services;

import com.app.collaborators.dto.AgencyDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AgencyService {
    List<AgencyDTO> findAll();

    AgencyDTO findById(Long agenceId);
    AgencyDTO save(AgencyDTO agencyDTO);

    void deleteById(Long id);


    AgencyDTO update(Long id, AgencyDTO agencyDTO);
}
