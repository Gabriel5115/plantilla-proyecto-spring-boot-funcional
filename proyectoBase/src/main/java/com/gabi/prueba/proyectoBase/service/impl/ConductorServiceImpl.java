package com.gabi.prueba.proyectoBase.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.gabi.prueba.proyectoBase.dto.ConductorResponse;
import com.gabi.prueba.proyectoBase.entity.ConductorEntity;
import com.gabi.prueba.proyectoBase.repository.ConductorRepository;
import com.gabi.prueba.proyectoBase.service.IConductorService;
import com.gabi.prueba.proyectoBase.utils.MapperDTO;

public class ConductorServiceImpl implements IConductorService {

	private static final Logger log = LoggerFactory.getLogger(ConductorServiceImpl.class);
	
	@Autowired
	ConductorRepository conductorRepository;
	
	@Override
	public ConductorResponse searchConductor(String numEmpleado) {
		
		
		log.info("Buscamos el em pleado con numEmpleado {}", numEmpleado);
		
		ConductorResponse response = new ConductorResponse();
		
		ConductorEntity conductorEntity = conductorRepository.findByNumEmpleado(numEmpleado);
		
		response.setConductorDto(MapperDTO.getConductores(conductorEntity));
		
		return response;
	}

}
