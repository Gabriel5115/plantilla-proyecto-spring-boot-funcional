package com.gabi.prueba.proyectoBase.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabi.prueba.proyectoBase.dto.UsuarioResponse;
import com.gabi.prueba.proyectoBase.entity.UsuarioEntity;
import com.gabi.prueba.proyectoBase.repository.UsuarioRepository;
import com.gabi.prueba.proyectoBase.service.IUsuarioService;
import com.gabi.prueba.proyectoBase.utils.MapperDTO;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	private static final Logger log = LoggerFactory.getLogger(UsuarioServiceImpl.class);
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public UsuarioResponse searchUsuario(String id) {
		// TODO Auto-generated method stub
		
		log.info("Buscamos el usuario con id {}", id);
		
		UsuarioResponse response = new UsuarioResponse();
		
		UsuarioEntity usuarioEntity = usuarioRepository.findByIdUsuario(id);
		
		response.setUsuarioDto(MapperDTO.getUsuarios(usuarioEntity));
		
		return response;
	}
	
	
}
