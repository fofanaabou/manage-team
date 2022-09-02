package com.app.projects.domain;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "profil_eligible")
public class ProfileEligible {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profil_eligible_id_seq")
    @SequenceGenerator(name = "profil_eligible_id_seq", sequenceName = "profil_eligible_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "profil_id")
    private Long profileId;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @Column(name = "number_poste")
    private Integer numberPoste;

}
