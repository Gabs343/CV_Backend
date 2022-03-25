package com.miCVGabriel.mypackage.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter @Entity
@Table(name = "educations")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Title", length = 75, nullable = false)
    private String title;

    @Column(name = "Institution", length = 75, nullable = false)
    private String institution;

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

    @Column(name = "Finished", nullable = false)
    private Boolean finished;

    @Column(name = "Description", nullable = false)
    private String description;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "userID", nullable = false, referencedColumnName = "id")
    @JsonBackReference
    private  User user;
}
