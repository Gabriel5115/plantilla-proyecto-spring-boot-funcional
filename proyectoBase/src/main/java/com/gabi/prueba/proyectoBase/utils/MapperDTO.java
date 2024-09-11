package com.gabi.prueba.proyectoBase.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gabi.prueba.proyectoBase.dto.AutobusesDto;
import com.gabi.prueba.proyectoBase.dto.UsuarioDTO;
import com.gabi.prueba.proyectoBase.entity.AutobusesEntity;
import com.gabi.prueba.proyectoBase.entity.UsuarioEntity;
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
	
	public static UsuarioDTO getUsuarios(UsuarioEntity user) {
		
		UsuarioDTO usuario = new UsuarioDTO();
		
		usuario = getUsuario(user);
		
		return usuario;
	}
	
	public static UsuarioDTO getUsuario(UsuarioEntity user) {
		
		log.info("Mapper DTO getUsuario");
		
		
		UsuarioDTO dto = new UsuarioDTO();
		dto.setIdUsuario(user.getIdUsuario());
		dto.setUsername(user.getUsername());
		dto.setRole(user.getRole());
		
		return dto;
		
	}
	
}
