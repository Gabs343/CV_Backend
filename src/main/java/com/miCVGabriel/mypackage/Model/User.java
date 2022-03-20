package com.miCVGabriel.mypackage.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
}
