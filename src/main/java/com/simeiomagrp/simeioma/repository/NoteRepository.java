package com.simeiomagrp.simeioma.repository;

import com.simeiomagrp.simeioma.entity.note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<note, Long> {

    List<note> findByUsername(String username);
}