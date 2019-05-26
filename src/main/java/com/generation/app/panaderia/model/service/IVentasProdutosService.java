package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.entity.VentasProductos;

import java.util.List;

public interface IVentasProdutosService {
    public List<VentasProductos> findAll();
    public void save(VentasProductos ventasProductos);
    public VentasProductos findOne(Integer id);
    public  void delete(Integer id);
}
