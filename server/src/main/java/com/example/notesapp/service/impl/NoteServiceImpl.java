package com.example.notesapp.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.notesapp.model.Note;
import com.example.notesapp.repository.NoteDAO;
import com.example.notesapp.service.NoteService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class NoteServiceImpl implements NoteService{
  private final NoteDAO repository;

  @Override
  public List<Note> findAllNotes() {
    return repository.findAllNotes();
  }

  @Override
  public Note createNote(Note note) {
    return repository.createNote(note);
  }

  @Override
  public Note findNoteById(int id) {
    return repository.findNoteById(id);
  }

  @Override
  public Note updateNote(Note note) {
    return repository.updateNote(note);
  }

  @Override
  public void deleteNote(int id) {
    repository.deleteNote(id);
  }
  
}
