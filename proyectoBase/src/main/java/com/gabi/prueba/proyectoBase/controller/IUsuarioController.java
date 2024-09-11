package com.gabi.prueba.proyectoBase.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import com.gabi.prueba.proyectoBase.dto.UsuarioResponse;

@Controller
public interface IUsuarioController {

	
	ResponseEntity<UsuarioResponse> findUsuario(@PathVariable String id);
}
