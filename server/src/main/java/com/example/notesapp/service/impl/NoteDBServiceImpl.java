package com.example.notesapp.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.notesapp.model.Note;
import com.example.notesapp.repository.NoteRepository;
import com.example.notesapp.service.NoteService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Primary
public class NoteDBServiceImpl implements NoteService {

  private final NoteRepository repository;

  @Override
  public List<Note> findAllNotes() {
    return repository.findAll();
  }

  @Override
  public Note createNote(Note note) {
    return repository.save(note);
  }

  @Override
  public Note findNoteById(Long id) {
    return repository.findNoteById(id);
  }

  @Override
  public Note updateNote(Long id,Note updatedNote) {
    Note existingNote = repository.findNoteById(id);
    if (existingNote == null) {
        throw new RuntimeException("Note not found with id: " + id);
    }
    existingNote.setTitle(updatedNote.getTitle());
    existingNote.setContent(updatedNote.getContent());
    existingNote.setCreatedAt(LocalDate.now());
    return repository.save(existingNote);
  }

  @Override
  public void deleteNote(Long id) {
    repository.deleteById(id);
  }
  
}
