package com.generation.app.panaderia.model.dao;

import com.generation.app.panaderia.model.entity.Usuarios;
import org.springframework.data.repository.CrudRepository;

public interface IUsuariosDao extends CrudRepository<Usuarios,Integer> {
    public Usuarios findByNombreUsuario(String nombreUsuario);

}
