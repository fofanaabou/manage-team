package com.app.collaborators.services;

import com.app.collaborators.dto.AgencyDTO;
import com.app.collaborators.entities.Agence;
import com.app.collaborators.mappers.AgenceMapper;
import com.app.collaborators.repositories.AgenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AgencyServiceImpl implements  AgencyService{

    private final AgenceRepository agenceRepository;
    private final AgenceMapper agenceMapper;

    public AgencyServiceImpl(AgenceRepository agenceRepository, AgenceMapper agenceMapper) {
        this.agenceRepository = agenceRepository;
        this.agenceMapper = agenceMapper;
    }

    @Override
    public List<AgencyDTO> findAll() {
        return agenceRepository.findAll()
                .stream()
                .map(agenceMapper::agenceToAgenceDto)
                .collect(Collectors.toList());
    }

    @Override
    public AgencyDTO findById(Long agenceId) {
        return agenceRepository.findById(agenceId)
                .map(agenceMapper::agenceToAgenceDto)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public AgencyDTO save(AgencyDTO agencyDTO) {
        return saveAndReturnDTO(agenceMapper.agenceDtoToAgence(agencyDTO));

    }

    @Override
    public void deleteById(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public AgencyDTO update(Long id, AgencyDTO agencyDTO) {
        Agence agence = agenceMapper.agenceDtoToAgence(agencyDTO);
        agence.setId(id);
        return saveAndReturnDTO(agence);
    }

    private AgencyDTO saveAndReturnDTO(Agence agence){
        Agence saveAgence = agenceRepository.save(agence);

        return agenceMapper.agenceToAgenceDto(saveAgence);
    }
}
