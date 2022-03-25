package com.miCVGabriel.mypackage.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter @Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "work_experiences")
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Charge_Name", length = 75, nullable = false)
    private String chargeName;

    @Column(name = "Company", length = 75, nullable = false)
    private String company;

    @Column(name = "Img", nullable = false)
    private String img;

    @Column(name = "Entry", nullable = false)
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date entry;

    @Column(name = "Way_Out")
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date wayOut;

    @Column(name = "Present_Day", nullable = false)
    private Boolean presentDay;

    @Column(name = "Description", nullable = false)
    private String description;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "userID", nullable = false, referencedColumnName = "id")
    @JsonBackReference
    private  User user;
}
