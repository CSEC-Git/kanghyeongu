package com.example.GameOfLife.service;

import com.example.GameOfLife.model.User;

public interface UserService {
    User findById(Long id);

    User save(User user);

    boolean existsByEmail(String email);
}
