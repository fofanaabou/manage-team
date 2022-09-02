package com.app.affectation.service;

import com.app.affectation.domain.Profile;
import com.app.affectation.dto.ProfileDTO;
import com.app.affectation.mapper.ProfileMapper;
import com.app.affectation.repositories.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService{

    private final ProfileRepository profileRepository;
    private final ProfileMapper profileMapper;


    @Override
    public List<ProfileDTO> findAll() {

        return profileRepository.findAll()
                .stream()
                .map(profileMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProfileDTO findById(Long id) {

        return profileMapper.toDTO(profileRepository.findById(id).orElseThrow(RuntimeException::new));
    }

    @Override
    public ProfileDTO save(ProfileDTO profileDTO) {

        return profileMapper.toDTO(profileRepository.save(profileMapper.toObject(profileDTO)));
    }

    @Override
    public void delete(Long id) {

        profileRepository.deleteById(id);
    }

    @Override
    public ProfileDTO update(Long id, ProfileDTO profileDTO) {

        Profile profile = profileRepository.findById(id).orElseThrow(RuntimeException::new);

        return profileMapper.toDTO(profile);
    }
}
