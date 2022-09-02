package com.app.collaborators.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Category")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long Id;

    @Column(name = "libelle")
    private  String libelle;

}
