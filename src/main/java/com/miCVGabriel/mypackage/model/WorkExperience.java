package com.miCVGabriel.mypackage.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter @Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Charge_Name", length = 75, nullable = false)
    private String chargeName;

    @Column(name = "Company", length = 75, nullable = false)
    private String company;

    @Column(name = "Img", nullable = false)
    private String img;

    @Column(name = "Entry", nullable = false)
    private Date entry;

    @Column(name = "Exit")
    private Date exit;

    @Column(name = "Current", nullable = false)
    private Boolean current;

    @Column(name = "Description", nullable = false)
    private String description;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "userID", nullable = false, referencedColumnName = "id")
    @JsonBackReference
    private  User user;
}
