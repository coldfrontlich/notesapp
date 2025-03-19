package com.example.notesapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notesapp.model.Note;
import com.example.notesapp.service.NoteService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api/v1/notes")
@AllArgsConstructor
public class NoteController {

  private final NoteService noteService;
  
  @GetMapping
  public List<Note> findAllNotes() {
    return noteService.findAllNotes();
  }


  @PostMapping("create")
  public Note createNote(@RequestBody Note note) {
    return noteService.createNote(note);
  }

  @GetMapping("/{id}")
  public Note findNoteById(@PathVariable int id) {
    return noteService.findNoteById(id);
  }

  @PutMapping("update")
  public Note updateNote(@RequestBody Note note) {
    return noteService.updateNote(note);
  }

  @DeleteMapping("delete/{id}")
  public void deleteNote(@PathVariable int id) {
    noteService.deleteNote(id);
  }
}
