package com.gabi.prueba.proyectoBase.service;

import com.gabi.prueba.proyectoBase.dto.AutobusesDto;
import com.gabi.prueba.proyectoBase.dto.AutobusesListResponse;
import com.gabi.prueba.proyectoBase.dto.AutobusesResponse;
import com.gabi.prueba.proyectoBase.exception.CustomException;

public interface IAutobusesService {
	
	AutobusesResponse searchAutobus(String id) throws CustomException;
	
	void save(AutobusesDto dto) throws CustomException;
	
	void create(AutobusesDto dto) throws CustomException;
	
	AutobusesListResponse listarAutobus(String marcas) throws CustomException;
}
