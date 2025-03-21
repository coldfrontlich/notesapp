package com.example.notesapp.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "notes")
public class Note {
  @Id
  @GeneratedValue
  private Long id;

  private String title;
  private String content;
  private LocalDate createdAt;

  @PrePersist
  protected void onCreate() {
    createdAt = LocalDate.now();
  }
}
