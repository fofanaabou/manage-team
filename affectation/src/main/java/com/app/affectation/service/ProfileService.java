package com.app.affectation.service;

import com.app.affectation.dto.ProfileDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfileService {

    List<ProfileDTO> findAll();

    ProfileDTO findById(Long id);

    ProfileDTO save(ProfileDTO profileDTO);

    void delete(Long id);

    ProfileDTO update(Long id, ProfileDTO profileDTO);
}
