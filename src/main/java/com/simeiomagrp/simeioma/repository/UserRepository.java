package com.simeiomagrp.simeioma.repository;



import com.simeiomagrp.simeioma.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}