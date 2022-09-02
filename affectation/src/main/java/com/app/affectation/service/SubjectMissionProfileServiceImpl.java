package com.app.affectation.service;

import com.app.affectation.domain.SubjectMissionProfile;
import com.app.affectation.dto.SubjectMissionProfileDTO;
import com.app.affectation.mapper.SubjectMissionProfileMapper;
import com.app.affectation.repositories.SubjectMissionProfileRepository;
import lombok.RequiredArgsConstructor;
import org.bouncycastle.crypto.RuntimeCryptoException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SubjectMissionProfileServiceImpl implements SubjectMissionProfileService {

    private final SubjectMissionProfileRepository subjectMissionProfileRepository;
    private final SubjectMissionProfileMapper subjectMissionProfileMapper;


    @Override
    public List<SubjectMissionProfileDTO> findAll() {

        return subjectMissionProfileRepository.findAll()
                .stream()
                .map(subjectMissionProfileMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SubjectMissionProfileDTO findById(Long id) {

        return subjectMissionProfileMapper
                .toDTO(subjectMissionProfileRepository.findById(id).orElseThrow(RuntimeException::new));
    }

    @Override
    public SubjectMissionProfileDTO save(SubjectMissionProfileDTO subjectMissionProfileDTO) {

        return subjectMissionProfileMapper
                .toDTO(subjectMissionProfileRepository.save(subjectMissionProfileMapper.toObject(subjectMissionProfileDTO)));
    }

    @Override
    public void delete(Long id) {

        subjectMissionProfileRepository.deleteById(id);
    }

    @Override
    public SubjectMissionProfileDTO update(Long id, SubjectMissionProfileDTO subjectMissionProfileDTO) {

        SubjectMissionProfile subjectMissionProfile = subjectMissionProfileRepository.findById(id).orElseThrow(RuntimeCryptoException::new);

        return subjectMissionProfileMapper.toDTO(subjectMissionProfile);
    }
}
