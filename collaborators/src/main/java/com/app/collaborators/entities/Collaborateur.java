package com.app.collaborators.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "collaborateur")
public class Collaborateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "agence_id")
    private  Agence agence;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "category_id")
    private Categorie category;

    @Column(name = "first_name")
    private  String nom;

    @Column(name = "last_name")
    private String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone")
    private  String telephone;

    @Column(name = "date_debut_carriere")
    private LocalDate date_debut_carriere;

    @Column(name = "cv_url")
    private  String urlCv;

    @JoinColumn(name = "parent_id")
    @OneToOne(cascade = CascadeType.MERGE)
    private  Collaborateur manager;

    @OneToMany(mappedBy = "collaborateur", cascade = CascadeType.MERGE)
    private List<CollaboratorProfile> collaboratorProfiles;

}
