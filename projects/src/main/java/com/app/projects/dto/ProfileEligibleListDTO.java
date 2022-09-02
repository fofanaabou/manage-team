package com.app.projects.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ProfileEligibleListDTO {

    List<ProfileEligibleDTO> profileEligibles;

}
