package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.dao.IPanesDao;
import com.generation.app.panaderia.model.entity.Panes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PanesServiceImpl implements IPanesService{
    @Autowired
    private IPanesDao panesDao;
    @Override
    @Transactional(readOnly = true)
    public List<Panes> findAll() {
        return (List<Panes>) panesDao.findAll();
    }

    @Override
    @Transactional
    public void save(Panes panes) {
        panesDao.save(panes);
    }

    @Override
    @Transactional
    public Panes findOne(Integer id) {
        return panesDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        panesDao.deleteById(id);
    }

    public List<Panes> findByCategoriaPanes(String categoria){
        return panesDao.findByCategoriaPan(categoria);
    }


}
