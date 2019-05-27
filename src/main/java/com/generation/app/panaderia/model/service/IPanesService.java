package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.entity.Panes;

import java.util.List;

public interface IPanesService {
    public List<Panes> findAll();
    public void save(Panes panes);
    public Panes findOne(Integer id);
    public  void delete(Integer id);
    public List<Panes> findByCategoriaPanes(String categoria);
}
