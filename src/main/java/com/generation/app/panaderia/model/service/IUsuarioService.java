package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.entity.Usuarios;

import java.util.List;

public interface IUsuarioService {
    public List<Usuarios> findAll();
    public void save(Usuarios usuario);
    public Usuarios findOne(Integer id);
    public  void delete(Integer id);
}
