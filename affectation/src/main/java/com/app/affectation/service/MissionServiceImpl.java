package com.app.affectation.service;

import com.app.affectation.domain.Mission;
import com.app.affectation.dto.MissionDTO;
import com.app.affectation.mapper.MissionMapper;
import com.app.affectation.repositories.MissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MissionServiceImpl implements MissionService{

    private final MissionRepository missionRepository;
    private final MissionMapper missionMapper;

    @Override
    public List<MissionDTO> findAll() {

        return missionRepository.findAll()
                .stream()
                .map(missionMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public MissionDTO findById(Long id) {

        return missionMapper.toDTO(missionRepository.findById(id).orElseThrow(RuntimeException::new));
    }

    @Override
    public MissionDTO save(MissionDTO missionDTO) {

        return missionMapper.toDTO(missionRepository.save(missionMapper.toObject(missionDTO)));
    }

    @Override
    public void delete(Long id) {

        missionRepository.deleteById(id);
    }

    @Override
    public MissionDTO update(Long id, MissionDTO missionDTO) {

        Mission mission = missionRepository.findById(id).orElseThrow(RuntimeException::new);

        return missionMapper.toDTO(mission);
    }
}
