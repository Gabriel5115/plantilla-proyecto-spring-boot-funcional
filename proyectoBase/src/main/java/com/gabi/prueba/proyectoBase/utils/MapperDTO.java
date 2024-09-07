package com.gabi.prueba.proyectoBase.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gabi.prueba.proyectoBase.dto.AutobusesDto;
import com.gabi.prueba.proyectoBase.dto.ConductorDto;
import com.gabi.prueba.proyectoBase.entity.AutobusesEntity;
import com.gabi.prueba.proyectoBase.entity.ConductorEntity;
import com.gabi.prueba.proyectoBase.service.impl.AutobusesServiceImpl;

public class MapperDTO {

private static final Logger log = LoggerFactory.getLogger(AutobusesServiceImpl.class);
	
	public static AutobusesDto getAutobuses(AutobusesEntity autobus) {
		
		log.info("MapperDTO getAutobus");
		
		AutobusesDto bus = new AutobusesDto();
		
		bus = getAutobus(autobus);
		
		
		return bus;
		
	}
	
	public static AutobusesDto getAutobus(AutobusesEntity autobus) {
		
		log.info("MapperDTO getHistorico");
		
		AutobusesDto dto = new AutobusesDto();
		dto.setIdAutobus(autobus.getIdAutobus());
		dto.setAforo(autobus.getAforo());
		dto.setMarcas(autobus.getMarcas());
		dto.setModelos(autobus.getModelos());
		
		return dto;
		
	}
	
	public static ConductorDto getConductores(ConductorEntity conductor) {
		
		log.info("MapperDTO Conductores");
		
		ConductorDto driver = new ConductorDto();
		
		
		driver = getConductor(conductor);
		
		return driver;
		
	}
	
public static ConductorDto getConductor(ConductorEntity conductor) {
		
		log.info("MapperDTO getHistorico");
		
		ConductorDto dto = new ConductorDto();
		dto.setDni(conductor.getDni());
		dto.setNombre(conductor.getNombre());
		dto.setApellidos(conductor.getApellidos());
		dto.setNumeroEmpleado(conductor.getNumeroEmpleado());
		dto.setTurno(conductor.getTurno());
		dto.setFichajeInicio(conductor.getFichajeInicio());
		dto.setFichajeFin(conductor.getFichajeFin());
		
		
		return dto;
		
	}
}
