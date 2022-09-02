package com.app.collaborators.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "collaborateur_profil")
public class CollaboratorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "collaborator_profile_generator")
    @SequenceGenerator(name = "collaborator_profile_generator", sequenceName = "collaborateur_profil_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "annee_exp")
    private Long numberYear;

    @ManyToOne
    @JoinColumn(name = "collaborateur_id")
    private Collaborateur collaborateur;

    @Column(name = "profil_id")
    private Long profileId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CollaboratorProfile that = (CollaboratorProfile) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
