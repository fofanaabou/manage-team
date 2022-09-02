package com.app.projects.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ProjectDTO implements Serializable {
    private final Long id;
    private final String name;
    private final String description;
}
