package com.example.ilsan34.clientManager.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "photo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_photo")
    private Long id;

    @Column(name = "photo")
    @Lob
    private byte[] photo;

    @OneToOne(optional = false, mappedBy = "photo")
    private Publicist publicist;

    @OneToOne(optional = false, mappedBy = "photo")
    private  Trainer trainer;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    //@JoinColumn(name = "id_news")
    private News news;
}
