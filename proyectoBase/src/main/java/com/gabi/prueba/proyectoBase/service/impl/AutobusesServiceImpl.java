package com.gabi.prueba.proyectoBase.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabi.prueba.proyectoBase.dto.AutobusesResponse;
import com.gabi.prueba.proyectoBase.entity.AutobusesEntity;
import com.gabi.prueba.proyectoBase.repository.AutobusesRepository;
import com.gabi.prueba.proyectoBase.service.IAutobusesService;
import com.gabi.prueba.proyectoBase.utils.MapperDTO;

@Service
public class AutobusesServiceImpl implements IAutobusesService {

	private static final Logger log = LoggerFactory.getLogger(AutobusesServiceImpl.class);

	@Autowired
	AutobusesRepository autobusesRepository;
	
	@Override
	public AutobusesResponse searchAutobus(String id) {

		log.info("Buscamos el autobus con id {}", id);

		AutobusesResponse response = new AutobusesResponse();

		AutobusesEntity autobusesEntity = autobusesRepository.findByIdAutobus(id);

		response.setAutobusDto(MapperDTO.getAutobuses(autobusesEntity));

		return response;
	}

}
