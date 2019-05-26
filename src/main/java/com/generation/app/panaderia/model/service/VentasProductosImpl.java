package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.dao.IVentasProductosDao;
import com.generation.app.panaderia.model.entity.VentasProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class VentasProductosImpl  implements IVentasProdutosService{
    @Autowired
    private IVentasProductosDao ventasProductosDao;
    @Override
    @Transactional(readOnly = true)
    public List<VentasProductos> findAll() {
        return (List<VentasProductos>) ventasProductosDao.findAll();
    }

    @Override
    @Transactional
    public void save(VentasProductos ventasProductos) {
        ventasProductosDao.save(ventasProductos);
    }

    @Override
    @Transactional
    public VentasProductos findOne(Integer id) {
        return ventasProductosDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        ventasProductosDao.deleteById(id);
    }
}
