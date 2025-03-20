package com.example.notesapp.service;

import java.util.List;


import com.example.notesapp.model.Note;


public interface NoteService {
  
  List<Note> findAllNotes();
  Note createNote(Note note);
  Note findNoteById(Long id);
  Note updateNote(Long id,Note updatedNote);
  void deleteNote(Long id);
}
