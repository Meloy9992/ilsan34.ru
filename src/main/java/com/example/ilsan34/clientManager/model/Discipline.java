package com.example.ilsan34.clientManager.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "discipline")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Discipline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_discipline")
    private Long id;

    @Column(name = "name_discipline")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private Trainer trainer;

}
