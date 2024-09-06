package com.gabi.prueba.proyectoBase.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.gabi.prueba.proyectoBase.entity.EjemploGetNetEntity;

/**
 * Clase repository de la tabla EJEMPLO_GETNET del proyectoBase
 * 
 * @author jcbellver
 *
 */
public interface EjemploGetNetRepository extends CrudRepository<EjemploGetNetEntity, String>{
	
	@Query("select a from EjemploGetNetEntity a where UPPER(a.id) = UPPER(:id)")
	EjemploGetNetEntity getEjemploGetNetFromId(@Param("id") String id);

}
