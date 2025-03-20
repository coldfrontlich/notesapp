package com.example.notesapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.notesapp.model.Note;



public interface NoteRepository extends JpaRepository<Note, Long>{
  void deleteById(Long id);
  Note findNoteById(Long id);
}
