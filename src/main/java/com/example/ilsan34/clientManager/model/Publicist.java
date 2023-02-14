package com.example.ilsan34.clientManager.model;

import javax.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.Size;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "publicist", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Publicist implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_publicist")
    private BigInteger id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_photo")
    private Photo photo;

    @Column(name = "password")
    @Size(min = 2, message = "Не меньше 5 символов")
    private String password;

    @Column(name = "email")
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "publicist_roles",
            joinColumns = { @JoinColumn(name = "id_publicist") },
            inverseJoinColumns = { @JoinColumn(name = "id_role") })
    private List<Role> roles;

    @OneToMany(mappedBy = "publicist", fetch = FetchType.LAZY)
    private List<News> news = new ArrayList<>();

    @Column(name = "phone_number")
    private Long phoneNumber;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getRoles();
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
