package com.app.affectation.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProfileDTO implements Serializable, Comparable<ProfileDTO> {
    private final Long id;
    private final String libelle;

    @Override
    public int compareTo(ProfileDTO o) {
        return libelle.compareTo(o.libelle);
    }
}
