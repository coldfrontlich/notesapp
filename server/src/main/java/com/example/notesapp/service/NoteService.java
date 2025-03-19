package com.example.notesapp.service;

import java.util.List;


import com.example.notesapp.model.Note;


public interface NoteService {
  
  List<Note> findAllNotes();
  Note createNote(Note note);
  Note findNoteById(int id);
  Note updateNote(Note note);
  void deleteNote(int id);
}
