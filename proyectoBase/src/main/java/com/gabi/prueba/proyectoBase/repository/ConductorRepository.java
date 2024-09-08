package com.gabi.prueba.proyectoBase.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.gabi.prueba.proyectoBase.entity.ConductorEntity;

public interface ConductorRepository extends CrudRepository<ConductorEntity, Long>{

	Optional<ConductorEntity> findByNumeroEmpleado(String numeroEmpleado);
	
	
}
