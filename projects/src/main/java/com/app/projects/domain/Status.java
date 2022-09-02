package com.app.projects.domain;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "status_id_seq")
    @SequenceGenerator(name = "status_id_seq", sequenceName = "status_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "libelle")
    private String libelle;

    @OneToMany(mappedBy = "status")
    private Set<Subject> subjects;


}
