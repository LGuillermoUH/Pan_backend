package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.entity.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}

