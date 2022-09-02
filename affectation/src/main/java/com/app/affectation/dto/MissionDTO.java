package com.app.affectation.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class MissionDTO implements Serializable {
    private final Long id;
    private final LocalDate dateDebut;
    private final Long collaboratorId;
}
