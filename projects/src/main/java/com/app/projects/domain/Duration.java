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
@Table(name = "estimated_duration")
public class Duration {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estimated_duration_id_seq")
    @SequenceGenerator(name = "estimated_duration_id_seq", sequenceName = "estimated_duration_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "duration")
    private String duration;

    @OneToMany(mappedBy = "duration")
    private Set<Subject> subjects;

}
