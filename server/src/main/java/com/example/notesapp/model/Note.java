package com.example.notesapp.model;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Note {
  private int id;
  private String title;
  private String content;
  private LocalDateTime createdAt;
}
