package com.app.projects.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
public class SubjectDTO implements Serializable {
    private final Long id;
    private final String titre;
    private final String description;
    private final ProjectDTO project;
    private final DurationDTO duration;
    private final PriorityDTO priority;
    private final StatusDTO status;
    private final List<ProfileEligibleDTO> profileEligibles;
}
