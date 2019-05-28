package com.generation.app.panaderia.model.dao;

import com.generation.app.panaderia.model.entity.UserRole;
import org.springframework.data.repository.CrudRepository;

public interface IUserRolDao extends CrudRepository<UserRole,Long> {
}
