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
    private String content;

    @Column(nullable = false)
    private String username;

   // Constructors
   public note() {}

   public note(String title, String content, String username) {
       this.title = title;
       this.content = content;
       this.username = username;
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

   public String getContent() {
       return content;
   }

   public void setContent(String content) {
       this.content = content;
   }

   public String getUsername() {
       return username;
   }

   public void setUsername(String username) {
       this.username = username;
   }
}
