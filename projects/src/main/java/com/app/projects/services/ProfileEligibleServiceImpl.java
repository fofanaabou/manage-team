package com.app.projects.services;

import com.app.projects.domain.ProfileEligible;
import com.app.projects.domain.Subject;
import com.app.projects.dto.ProfileEligibleDTO;
import com.app.projects.mapper.ProfileEligibleMapper;
import com.app.projects.repositories.ProfileEligibleRepository;
import com.app.projects.repositories.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProfileEligibleServiceImpl implements ProfileEligibleService{

    private final ProfileEligibleRepository profileEligibleRepository;
    private final ProfileEligibleMapper profileEligibleMapper;

    private final SubjectRepository subjectRepository;

    @Override
    public List<ProfileEligibleDTO> findAll() {
        return profileEligibleRepository.findAll()
                .stream()
                .map(profileEligibleMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProfileEligibleDTO findByProfileIdAndSubject(Long profileId, Long subjectId) {
        Subject subject = subjectRepository.findById(subjectId).orElseThrow(RuntimeException::new);

        return profileEligibleRepository.findByProfileIdAndSubject(profileId, subject)
                .map(profileEligibleMapper::toDTO)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public ProfileEligibleDTO save(ProfileEligibleDTO profileEligibleDto) {

        return saveAndReturnDTO(profileEligibleMapper.toObject(profileEligibleDto));
    }

    private ProfileEligibleDTO saveAndReturnDTO(ProfileEligible profileEligible){

        ProfileEligible savedProfileEligible = profileEligibleRepository.save(profileEligible);

        return profileEligibleMapper.toDTO(savedProfileEligible);
    }

    @Override
    public ProfileEligibleDTO update(Long id, ProfileEligibleDTO profileEligibleDto) {

        ProfileEligible profileEligible = profileEligibleMapper.toObject(profileEligibleDto);
        profileEligible.setId(id);

        return saveAndReturnDTO(profileEligible);
    }
}
