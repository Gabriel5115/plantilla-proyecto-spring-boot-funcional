package com.gabi.prueba.proyectoBase.utils;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gabi.prueba.proyectoBase.dto.AutobusesDto;
import com.gabi.prueba.proyectoBase.entity.AutobusesEntity;
import com.gabi.prueba.proyectoBase.exception.CustomException;

public class MapperEntity {
	
	private static Logger log = LoggerFactory.getLogger(MapperEntity.class);
	
	
	public static AutobusesEntity getAutobusesEntity(AutobusesEntity procesoEntity, AutobusesDto procesoDTO) throws CustomException {
		
		return getAutobusEntity(procesoEntity, procesoDTO);
	}
	
	public static AutobusesEntity getAutobusEntity(AutobusesEntity procesoEntity, AutobusesDto procesoDTO) throws CustomException {
		
		log.info("getAutobusEntity inicio Mapeado de DTO a Entity {}", procesoEntity);
		
		if (Objects.isNull(procesoEntity)) {
			procesoEntity = new AutobusesEntity();
		}
		
		procesoEntity.setIdAutobus(procesoDTO.getIdAutobus());
		procesoEntity.setMarcas(procesoDTO.getMarcas());
		procesoEntity.setModelos(procesoDTO.getModelos());
		procesoEntity.setAforo(procesoDTO.getAforo());
		
		log.info("getAutobusEntity fin Mapeado Entity {}", procesoEntity);
		
		return procesoEntity;
	}
	
}
