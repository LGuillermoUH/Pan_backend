package com.generation.app.panaderia.model.dao;


import com.generation.app.panaderia.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
