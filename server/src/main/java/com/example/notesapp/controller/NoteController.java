package com.example.notesapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notesapp.model.Note;
import com.example.notesapp.service.NoteService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("api/v1/notes")
@AllArgsConstructor
public class NoteController {

  private final NoteService noteService;
  
  @GetMapping
  public List<Note> getAllNotes() {
    return noteService.findAllNotes();
  }

}
