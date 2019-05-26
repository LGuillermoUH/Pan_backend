package com.generation.app.panaderia.model.dao;

import com.generation.app.panaderia.model.entity.Insumos;
import org.springframework.data.repository.CrudRepository;

public interface IInsumosDao extends CrudRepository<Insumos,Integer> {
}
