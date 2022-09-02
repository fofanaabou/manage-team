package com.app.collaborators.dto;

import lombok.Data;

@Data
public class CategoryDTO implements Comparable<CategoryDTO>{
    private  Long Id;
    private  String libelle;

    @Override
    public int compareTo(CategoryDTO o) {
        return libelle.compareTo(o.libelle);
    }
}