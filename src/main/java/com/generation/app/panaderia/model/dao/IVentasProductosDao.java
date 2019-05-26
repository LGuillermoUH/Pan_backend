package com.generation.app.panaderia.model.dao;

import com.generation.app.panaderia.model.entity.VentasProductos;
import org.springframework.data.repository.CrudRepository;

public interface IVentasProductosDao extends CrudRepository<VentasProductos,Integer> {
}
