package com.generation.app.panaderia.model.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
