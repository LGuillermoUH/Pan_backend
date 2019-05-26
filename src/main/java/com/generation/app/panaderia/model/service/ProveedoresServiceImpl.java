package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.dao.IProveedoresDao;
import com.generation.app.panaderia.model.entity.Proveedores;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProveedoresServiceImpl implements IProveedorService{
    @Autowired
    private IProveedoresDao proveedoresDao;
    @Override
    public List<Proveedores> findAll() {
        return (List<Proveedores>) proveedoresDao.findAll();
    }

    @Override
    public void save(Proveedores proveedores) {
        proveedoresDao.save(proveedores);
    }

    @Override
    public Proveedores findOne(Integer id) {
        return proveedoresDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        proveedoresDao.deleteById(id);
    }
}
