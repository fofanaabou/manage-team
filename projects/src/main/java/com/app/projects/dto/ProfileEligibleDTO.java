package com.app.projects.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProfileEligibleDTO implements Serializable {
    private final Long id;
    private final Long profileId;
    private final Integer numberPoste;
}
