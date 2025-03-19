package com.example.notesapp.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.notesapp.model.Note;
import com.example.notesapp.service.NoteService;

@Service
public class NoteServiceImpl implements NoteService{

  @Override
  public List<Note> findAllNotes() {
    return null;
  }

  @Override
  public Note createNote(Note note) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createNote'");
  }

  @Override
  public Note findNoteById(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findNoteById'");
  }

  @Override
  public Note updateNote(Note note) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateNote'");
  }

  @Override
  public void deleteNote(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteNote'");
  }
  
}
