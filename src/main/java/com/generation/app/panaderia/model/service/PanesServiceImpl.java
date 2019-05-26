package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.dao.IPanesDao;
import com.generation.app.panaderia.model.entity.Panes;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PanesServiceImpl implements IPanesService{
    @Autowired
    private IPanesDao panesDao;
    @Override
    public List<Panes> findAll() {
        return (List<Panes>) panesDao.findAll();
    }

    @Override
    public void save(Panes panes) {
        panesDao.save(panes);
    }

    @Override
    public Panes findOne(Integer id) {
        return panesDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        panesDao.deleteById(id);
    }
}
