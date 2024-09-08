package com.gabi.prueba.proyectoBase.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		
		log.info("MapperDTO getAutobus");
		
		AutobusesDto dto = new AutobusesDto();
		dto.setIdAutobus(autobus.getIdAutobus());
		dto.setAforo(autobus.getAforo());
		dto.setMarcas(autobus.getMarcas());
		dto.setModelos(autobus.getModelos());
		
		return dto;
		
	}
	

	public static List<AutobusesDto> getListaAutobuses(List<AutobusesEntity> entity){
		
		log.info("getListaAutobuses Mapeo");
		
		List<AutobusesDto> autobuses = new ArrayList<>();
		for (AutobusesEntity autobusesEntity : entity) {
			autobuses.add(getAutobus(autobusesEntity));
		}
		
		return autobuses;
	}

	public static ConductorDto getConductores(Optional<ConductorEntity> conductor) {
		
		log.info("MapperDTO Conductores");
		
		ConductorDto driver = new ConductorDto();
		
		
		driver = getConductor(conductor);
		
		return driver;
		
	}
	
public static ConductorDto getConductor(Optional<ConductorEntity> conductor) {
		
		log.info("MapperDTO getHistorico");
		
		ConductorDto dto = new ConductorDto();
		dto.setDni(conductor.get().getDni());
		dto.setNombre(conductor.get().getNombre());
		dto.setApellidos(conductor.get().getApellidos());
		dto.setNumeroEmpleado(conductor.get().getNumeroEmpleado());
		dto.setTurno(conductor.get().getTurno());
		dto.setFichajeInicio(conductor.get().getFichajeInicio());
		dto.setFichajeFin(conductor.get().getFichajeFin());
		
		
		return dto;
		
	}
}
