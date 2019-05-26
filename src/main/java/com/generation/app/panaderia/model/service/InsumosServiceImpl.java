package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.dao.IInsumosDao;
import com.generation.app.panaderia.model.entity.Insumos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class InsumosServiceImpl implements IInsumosService {
    @Autowired
    private IInsumosDao insumosDao;
    @Override
    @Transactional(readOnly = true)
    public List<Insumos> findAll() {
        return (List<Insumos>) insumosDao.findAll();
    }

    @Override
    @Transactional
    public void save(Insumos insumos) {
        insumosDao.save(insumos);
    }

    @Override
    @Transactional
    public Insumos findOne(Integer id) {
        return insumosDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        insumosDao.deleteById(id);
    }
}
