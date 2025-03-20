package com.example.notesapp.config;

import com.example.notesapp.model.Note;
import com.example.notesapp.repository.NoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {

    private final NoteRepository noteRepository;

    public DataInitializer(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (noteRepository.count() == 0) {
            Note initialNote = Note.builder()
                    .title("Тестовая заметка")
                    .content("Это тестовая заметка, созданная при запуске приложения")
                    .createdAt(LocalDate.now())
                    .build();
            noteRepository.save(initialNote);
        }
    }
}
