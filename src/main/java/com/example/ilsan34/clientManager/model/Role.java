package com.example.ilsan34.clientManager.model;


import lombok.*;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "roles")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private Long id;
    @Column(name = "name")
    private String name;

/*
    @OneToMany(mappedBy = "publicists")
    private List<Publicist> publicists;
*/

    @Override
    public String getAuthority() {
        return getAuthority();
    }
}
