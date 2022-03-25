package com.miCVGabriel.mypackage.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter @Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "social_networks")
public class SocialNetwork {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "ID")
   private Long id;

   @Column(name = "Name", length = 55, nullable = false)
   private String name;

   @Column(name = "Link", nullable = false)
   private String link;

   @Column(name = "Img", nullable = false)
   private String img;

   @ManyToOne(optional = false, fetch = FetchType.LAZY)
   @JoinColumn(name = "userID", nullable = false, referencedColumnName = "id")
   @JsonBackReference
   private User user;
}
