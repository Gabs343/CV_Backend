package com.miCVGabriel.mypackage.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter @Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "proyects")
public class Proyect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Name", length = 55, nullable = false)
    private String name;

    @Column(name = "Img", nullable = false)
    private String img;

    @Column(name = "Description", nullable = false)
    private String description;

    @Column(name = "Link")
    private String link;

    @Column(name = "Finished", nullable = false)
    private Boolean finished;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "userID", nullable = false, referencedColumnName = "id")
    @JsonBackReference
    private User user;
}
