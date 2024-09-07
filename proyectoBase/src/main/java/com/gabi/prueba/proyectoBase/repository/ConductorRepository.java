package com.gabi.prueba.proyectoBase.repository;

import org.springframework.data.repository.CrudRepository;

import com.gabi.prueba.proyectoBase.entity.ConductorEntity;

public interface ConductorRepository extends CrudRepository<ConductorEntity, String>{

	ConductorEntity findByNumEmpleado(String numEmpleado);
	
}
