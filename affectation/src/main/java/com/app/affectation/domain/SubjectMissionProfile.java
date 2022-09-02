package com.app.affectation.domain;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "sujet_mission_profil")
public class SubjectMissionProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sujet_id")
    private Long subjectId;

    @ManyToOne
    @JoinColumn(name = "profil_id")
    private Profile profile;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private Mission mission;
}
