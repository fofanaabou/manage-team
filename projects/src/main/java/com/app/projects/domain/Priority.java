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
@Table(name = "priority")
public class Priority {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "priority_id_seq")
    @SequenceGenerator(name = "priority_id_seq", sequenceName = "priority_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "libelle")
    private String libelle;

    @OneToMany(mappedBy = "priority")
    private Set<Subject> subjects;

}
