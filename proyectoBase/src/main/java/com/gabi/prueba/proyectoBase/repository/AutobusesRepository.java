package com.gabi.prueba.proyectoBase.repository;

import org.springframework.data.repository.CrudRepository;

import com.gabi.prueba.proyectoBase.entity.AutobusesEntity;





public interface AutobusesRepository extends CrudRepository<AutobusesEntity, Long>{
	
	AutobusesEntity findById(long id);
}
