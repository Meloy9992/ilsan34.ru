package com.example.ilsan34.clientManager.model;

import javax.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.util.*;

@Entity
@Table(name = "news")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_news")
    private BigInteger id;

    @Column(name = "name_news")
    private String name;

    @Column(name = "description_news")
    private String description;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_publication")
    private Date date;

    @OneToMany(mappedBy = "news", fetch = FetchType.EAGER)
    private List<Photo> photo = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "fk_publicist")
    private Publicist publicist;
}
