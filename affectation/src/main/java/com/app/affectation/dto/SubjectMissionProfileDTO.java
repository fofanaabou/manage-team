package com.app.affectation.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SubjectMissionProfileDTO implements Serializable {
    private final Long id;
    private final Long subjectId;
    private final ProfileDTO profile;
    private final MissionDTO mission;
}
