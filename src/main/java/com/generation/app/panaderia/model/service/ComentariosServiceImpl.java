package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.dao.IComentariosDao;
import com.generation.app.panaderia.model.entity.Comentarios;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ComentariosServiceImpl implements IComentariosService{
    @Autowired
    private IComentariosDao comentariosDao;
    @Override
    public List<Comentarios> findAll() {
        return (List<Comentarios>) comentariosDao.findAll();
    }

    @Override
    public void save(Comentarios comentarios) {
        comentariosDao.save(comentarios);
    }

    @Override
    public Comentarios findOne(Integer id) {
        return comentariosDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        comentariosDao.deleteById(id);
    }
}
