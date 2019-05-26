package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.entity.Proveedores;

import java.util.List;

public interface IProveedorService {
    public List<Proveedores> findAll();
    public void save(Proveedores proveedores);
    public Proveedores findOne(Integer id);
    public  void delete(Integer id);
}
