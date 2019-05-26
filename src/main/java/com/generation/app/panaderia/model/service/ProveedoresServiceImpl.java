package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.dao.IProveedoresDao;
import com.generation.app.panaderia.model.entity.Proveedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ProveedoresServiceImpl implements IProveedorService{
    @Autowired
    private IProveedoresDao proveedoresDao;
    @Override
    @Transactional(readOnly = true)
    public List<Proveedores> findAll() {
        return (List<Proveedores>) proveedoresDao.findAll();
    }

    @Override
    @Transactional
    public void save(Proveedores proveedores) {
        proveedoresDao.save(proveedores);
    }

    @Override
    @Transactional
    public Proveedores findOne(Integer id) {
        return proveedoresDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        proveedoresDao.deleteById(id);
    }
}
