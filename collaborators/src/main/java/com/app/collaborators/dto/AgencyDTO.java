package com.app.collaborators.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgencyDTO implements Comparable<AgencyDTO> {

    private Long id;

    private String ville;

    private String telephoneAgence;

    @Override
    public int compareTo(AgencyDTO o) {
        return ville.compareTo(o.ville);
    }
}
