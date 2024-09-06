package com.gabi.prueba.proyectoBase.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.gabi.prueba.proyectoBase.dto.AutobusesDto;
import com.gabi.prueba.proyectoBase.dto.AutobusesListResponse;
import com.gabi.prueba.proyectoBase.dto.AutobusesResponse;
import com.gabi.prueba.proyectoBase.exception.CustomException;


@Controller
public interface IAutobusesController {
	
	/**
	 * Metodo encargado de buscar todos los usurarios de la BBDD
	 */
	
	ResponseEntity<AutobusesResponse> findAutobuses(@PathVariable String id) throws CustomException;
	
	ResponseEntity<Void>save(@RequestBody AutobusesDto autobus) throws CustomException;
	
	ResponseEntity<Void>create(@RequestBody AutobusesDto autobus) throws CustomException;
	
	ResponseEntity<AutobusesListResponse> listaMarca(@PathVariable String marcas) throws CustomException;
}
