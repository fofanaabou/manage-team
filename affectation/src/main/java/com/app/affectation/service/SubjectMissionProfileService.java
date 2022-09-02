package com.app.affectation.service;

import com.app.affectation.dto.SubjectMissionProfileDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubjectMissionProfileService {

    List<SubjectMissionProfileDTO> findAll();

    SubjectMissionProfileDTO findById(Long id);

    SubjectMissionProfileDTO save(SubjectMissionProfileDTO subjectMissionProfileDTO);

    void delete(Long id);

    SubjectMissionProfileDTO update(Long id, SubjectMissionProfileDTO subjectMissionProfileDTO);
}
