package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.dao.IUsuariosDao;
import com.generation.app.panaderia.model.entity.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UsuarioServiceImpl implements IUsuarioService{
    @Autowired
    private IUsuariosDao usuariosDao;
    @Override
    @Transactional(readOnly = true)
    public List<Usuarios> findAll() {
        return (List<Usuarios>) usuariosDao.findAll();
    }

    @Override
    @Transactional
    public void save(Usuarios usuario) {
        usuariosDao.save(usuario);
    }

    @Override
    @Transactional
    public Usuarios findOne(Integer id) {
        return usuariosDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        usuariosDao.deleteById(id);
    }
}
