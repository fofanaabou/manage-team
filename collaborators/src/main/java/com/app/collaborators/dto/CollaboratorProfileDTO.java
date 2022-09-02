package com.app.collaborators.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CollaboratorProfileDTO implements Serializable {
    private final Long id;
    private final Long numberYear;
    private final Long profileId;
}
