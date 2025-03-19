package com.example.notesapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.notesapp.model.Note;

public class NoteDAO {
  private final List<Note> NOTES = new ArrayList<>();


  public List<Note> findAllNotes() {
    return NOTES;
  }


  public Note createNote(Note note) {
    NOTES.add(note);
    return note;
  }


  public Note findNoteById(int id) {
    return NOTES.stream()
    .filter(element -> element.getId() == id)
    .findFirst()
    .orElse(null);
  }

  public Note updateNote(Note updatedNote) {
    for (Note note : NOTES) {
      if (note.getId() == updatedNote.getId()) {
        note.setTitle(updatedNote.getTitle());
        note.setContent(updatedNote.getContent());
        return note;
      }
    }
    throw new RuntimeException("Not found note");
  }



  public void deleteNote(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteNote'");
  }
}
