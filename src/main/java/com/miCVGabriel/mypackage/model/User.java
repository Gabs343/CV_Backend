package com.miCVGabriel.mypackage.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter @Setter @Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Name", length = 55, nullable = false)
    private String name;

    @Column(name = "Img", nullable = false)
    private String img;

    @Column(name = "Title", length = 155, nullable = false)
    private String title;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "Description", nullable = false)
    private String description;

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, orphanRemoval = true)
    @JsonManagedReference
    private Set<Proyect> proyects;

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, orphanRemoval = true)
    @JsonManagedReference
    private Set<SocialNetwork> socialNetworks;

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, orphanRemoval = true)
    @JsonManagedReference
    private Set<WorkExperience> workExperiences;
}
