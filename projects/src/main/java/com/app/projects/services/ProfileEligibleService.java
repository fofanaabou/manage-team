package com.app.projects.services;

import com.app.projects.dto.ProfileEligibleDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfileEligibleService {

    List<ProfileEligibleDTO> findAll();

    ProfileEligibleDTO findByProfileIdAndSubject(Long id, Long sujetId);

    ProfileEligibleDTO save(ProfileEligibleDTO profileEligibleDto);

    ProfileEligibleDTO update(Long id, ProfileEligibleDTO profileEligibleDto);
}
