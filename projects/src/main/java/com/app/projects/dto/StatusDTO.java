package com.app.projects.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class StatusDTO implements Serializable {
    private final Long id;
    private final String libelle;
}
