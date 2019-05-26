package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.dao.IVentasDao;
import com.generation.app.panaderia.model.entity.Ventas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class VentasServiceImpl implements IVentasService{
    @Autowired
    private IVentasDao ventasDao;
    @Override
    @Transactional(readOnly = true)
    public List<Ventas> findAll() {
        return (List<Ventas>) ventasDao.findAll();
    }

    @Override
    @Transactional
    public void save(Ventas ventas) {
        ventasDao.save(ventas);
    }

    @Override
    @Transactional
    public Ventas findOne(Integer id) {
        return ventasDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        ventasDao.deleteById(id);
    }
}
