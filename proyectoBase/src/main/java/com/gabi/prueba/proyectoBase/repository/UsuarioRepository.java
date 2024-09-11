package com.gabi.prueba.proyectoBase.repository;

import org.springframework.data.repository.CrudRepository;

import com.gabi.prueba.proyectoBase.entity.UsuarioEntity;

public interface UsuarioRepository extends CrudRepository<UsuarioEntity, Integer>{

	UsuarioEntity findByIdUsuario(String id);
}
