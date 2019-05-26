package com.generation.app.panaderia.model.dao;

import com.generation.app.panaderia.model.entity.Comentarios;
import org.springframework.data.repository.CrudRepository;

public interface IComentariosDao extends CrudRepository<Comentarios,Integer> {
}
