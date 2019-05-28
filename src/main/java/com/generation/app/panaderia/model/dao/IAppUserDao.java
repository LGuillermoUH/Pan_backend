package com.generation.app.panaderia.model.dao;

import com.generation.app.panaderia.model.entity.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface IAppUserDao extends CrudRepository<AppUser,Long> {
}
