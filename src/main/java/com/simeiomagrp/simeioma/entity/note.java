package com.simeiomagrp.simeioma.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;

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

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column
    private Double latitude;

    @Column
    private Double longitude;

    @Column
    private String location;

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

   public LocalDateTime getCreatedAt() {
       return createdAt;
   }

   public void setCreatedAt(LocalDateTime createdAt) {
       this.createdAt = createdAt;
   }

   public Double getLatitude() {
       return latitude;
   }

   public void setLatitude(Double latitude) {
       this.latitude = latitude;
   }

   public Double getLongitude() {
       return longitude;
   }

   public void setLongitude(Double longitude) {
       this.longitude = longitude;
   }

   public String getLocation() {
       return location;
   }

   public void setLocation(String location) {
       this.location = location;
   }
}
