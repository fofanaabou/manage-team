package com.app.projects.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
public class DurationDTO implements Serializable {
    private  Long id;
    private  String duration;
}
