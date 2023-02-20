package com.example.ilsan34.clientManager.model;

import javax.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

import java.math.BigInteger;

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
    private BigInteger id;

    @Column(name = "photo")
    private String photo;

/*    @OneToOne(optional = false, mappedBy = "photo")
    private Publicist publicist;

    @OneToOne(optional = false, mappedBy = "photo")
    private  Trainer trainer;*/

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_news")
    private News news;
}
