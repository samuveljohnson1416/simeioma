package com.simeiomagrp.simeioma.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "notes")
public class note {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(nullable = false)
   private String title;

   @Column(nullable = false, columnDefinition = "TEXT")
   private String description;

   // Constructors
   public note() {}

   public note(String title, String description) {
       this.title = title;
       this.description = description;
   }

   // Getters & Setters
   public Long getId() {
       return id;
   }

   public String getTitle() {
       return title;
   }

   public void setTitle(String title) {
       this.title = title;
   }

   public String getDescription() {
       return description;
   }

   public void setDescription(String description) {
       this.description = description;
   }
}
