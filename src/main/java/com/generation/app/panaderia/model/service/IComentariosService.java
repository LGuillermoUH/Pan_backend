package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.entity.Comentarios;

import java.util.List;

public interface IComentariosService {
    public List<Comentarios> findAll();
    public void save(Comentarios comentarios);
    public Comentarios findOne(Integer id);
    public  void delete(Integer id);
}
