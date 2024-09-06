package com.gabi.prueba.proyectoBase.utils;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gabi.prueba.proyectoBase.dto.AutobusesDto;
import com.gabi.prueba.proyectoBase.entity.AutobusesEntity;
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
}
