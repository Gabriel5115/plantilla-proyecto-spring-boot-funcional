package com.gabi.prueba.proyectoBase.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import com.gabi.prueba.proyectoBase.dto.AutobusesResponse;


@Controller
public interface IAutobusesController {
	
	/**
	 * Metodo encargado de buscar todos los usurarios de la BBDD
	 */
	
	ResponseEntity<AutobusesResponse> findAutobuses(@PathVariable String id);
	
}
