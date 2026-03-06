package com.simeiomagrp.simeioma.controller;

import com.simeiomagrp.simeioma.entity.note;
import com.simeiomagrp.simeioma.repository.NoteRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
@CrossOrigin(origins = "http://localhost:63342", allowCredentials = "true")
public class NoteController {

    @Autowired
    private NoteRepository repository;

    @GetMapping
    public List<note> getNotes(HttpSession session) {

        String username = (String) session.getAttribute("username");

        if (username == null) {
            throw new RuntimeException("User not logged in");
        }

        return repository.findByUsername(username);
    }

    @PostMapping
    public note createNote(@RequestBody note note,
                           HttpSession session) {

        String username = (String) session.getAttribute("username");

        if (username == null) {
            throw new RuntimeException("User not logged in");
        }

        note.setUsername(username);
        return repository.save(note);
    }

    @PutMapping("/{id}")
    public note updateNote(@PathVariable Long id,
                           @RequestBody note updatedNote,
                           HttpSession session) {

        String username = (String) session.getAttribute("username");

        if (username == null) {
            throw new RuntimeException("User not logged in");
        }

        note existingNote = repository.findById(id).orElse(null);

        if (existingNote != null &&
                existingNote.getUsername().equals(username)) {

            existingNote.setTitle(updatedNote.getTitle());
            existingNote.setContent(updatedNote.getContent());

            return repository.save(existingNote);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Long id,
                           HttpSession session) {

        String username = (String) session.getAttribute("username");

        if (username == null) {
            throw new RuntimeException("User not logged in");
        }

        note note = repository.findById(id).orElse(null);

        if (note != null &&
                note.getUsername().equals(username)) {

            repository.delete(note);

        }
    }
}