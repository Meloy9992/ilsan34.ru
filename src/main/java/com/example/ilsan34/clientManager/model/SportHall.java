package com.example.ilsan34.clientManager.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "sport_hall")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SportHall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sports_hall")
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "information")
    private String information;

    @ManyToOne(fetch = FetchType.LAZY)
    private Trainer trainer;
}
