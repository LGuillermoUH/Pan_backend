package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.entity.Ventas;

import java.util.List;

public interface IVentasService {
    public List<Ventas> findAll();
    public void save(Ventas ventas);
    public Ventas findOne(Integer id);
    public  void delete(Integer id);
}
