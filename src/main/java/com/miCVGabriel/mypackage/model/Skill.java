package com.miCVGabriel.mypackage.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter @Entity
@Table(name = "Skills")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Name", length = 55, nullable = false)
    private String name;

    @Column(name = "Percent", nullable = false)
    private Integer percent;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "userID", nullable = false, referencedColumnName = "id")
    @JsonBackReference
    private User user;
}
