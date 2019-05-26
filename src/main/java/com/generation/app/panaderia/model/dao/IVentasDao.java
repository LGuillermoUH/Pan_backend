package com.generation.app.panaderia.model.dao;

import com.generation.app.panaderia.model.entity.Ventas;
import org.springframework.data.repository.CrudRepository;

public interface IVentasDao extends CrudRepository<Ventas,Integer> {
}
