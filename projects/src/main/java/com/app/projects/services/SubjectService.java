package com.app.projects.services;

import com.app.projects.dto.SubjectDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubjectService {
    List<SubjectDTO> findAll();

    SubjectDTO findByd(Long id);

    SubjectDTO findByTitle(String title);

    SubjectDTO save(SubjectDTO subjectDTO);

    SubjectDTO update(Long id, SubjectDTO subjectDTO);

    void delete(SubjectDTO subjectDTO);

    void deleteById(Long id);
}
