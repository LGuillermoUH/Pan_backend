package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.entity.Insumos;

import java.util.List;

public interface IInsumosService {
    public List<Insumos> findAll();
    public void save(Insumos insumos);
    public Insumos findOne(Integer id);
    public  void delete(Integer id);
}
