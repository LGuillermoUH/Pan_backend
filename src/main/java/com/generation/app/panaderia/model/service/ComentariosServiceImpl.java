package com.generation.app.panaderia.model.service;

import com.generation.app.panaderia.model.dao.IComentariosDao;
import com.generation.app.panaderia.model.entity.Comentarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ComentariosServiceImpl implements IComentariosService{
    @Autowired
    private IComentariosDao comentariosDao;
    @Override
    @Transactional(readOnly = true)
    public List<Comentarios> findAll() {
        return (List<Comentarios>) comentariosDao.findAll();
    }

    @Override
    @Transactional
    public void save(Comentarios comentarios) {
        comentariosDao.save(comentarios);
    }

    @Override
    @Transactional
    public Comentarios findOne(Integer id) {
        return comentariosDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        comentariosDao.deleteById(id);
    }
}
