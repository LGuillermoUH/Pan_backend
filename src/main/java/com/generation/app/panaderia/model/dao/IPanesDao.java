package com.generation.app.panaderia.model.dao;

import com.generation.app.panaderia.model.entity.Panes;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface IPanesDao extends CrudRepository<Panes,Integer> {
    List<Panes> findByCategoriaPan(String CategoriaPan);
    List<Panes> findByCategoriaPanIsNotIn(Collection<String> CategoriaPan);
}
