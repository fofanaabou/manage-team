package com.app.projects.services;

import com.app.projects.domain.Subject;
import com.app.projects.dto.SubjectDTO;
import com.app.projects.mapper.SubjectMapper;
import com.app.projects.repositories.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    private final SubjectMapper subjectMapper;


    @Override
    public List<SubjectDTO> findAll() {

        return subjectRepository.findAll()
                .stream()
                .map(subjectMapper::sujetToSujetDto)
                .collect(Collectors.toList());
    }

    @Override
    public SubjectDTO findByd(Long id) {
        return subjectRepository.findById(id)
                .map(subjectMapper::sujetToSujetDto)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public SubjectDTO findByTitle(String title) {
        return subjectRepository.findByTitre(title)
                .map(subjectMapper::sujetToSujetDto)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public SubjectDTO save(SubjectDTO subjectDTO) {

        Subject savedSubject = subjectRepository.save(subjectMapper.sujetDtoToSujet(subjectDTO));

        return subjectMapper.sujetToSujetDto(savedSubject);
    }

    @Override
    public SubjectDTO update(Long id, SubjectDTO subjectDTO) {

        Subject savedSubject = subjectRepository.save(subjectMapper.sujetDtoToSujet(subjectDTO));

        return subjectMapper.sujetToSujetDto(savedSubject);
    }

    @Override
    public void delete(SubjectDTO subjectDTO) {

        subjectRepository.delete(subjectMapper.sujetDtoToSujet(subjectDTO));

    }

    @Override
    public void deleteById(Long id) {

        subjectRepository.deleteById(id);

    }
}
