package com.gabi.prueba.proyectoBase.repository;

import org.springframework.data.repository.CrudRepository;

import com.gabi.prueba.proyectoBase.entity.UserLoginEntity;

public interface UserRolRepository extends CrudRepository<UserLoginEntity, String>{

	UserLoginEntity findOneByUsernameAndPassword(String username, String password);
}
