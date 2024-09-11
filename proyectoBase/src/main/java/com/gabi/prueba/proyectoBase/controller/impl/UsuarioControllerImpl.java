package com.gabi.prueba.proyectoBase.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabi.prueba.proyectoBase.controller.IUsuarioController;
import com.gabi.prueba.proyectoBase.dto.AutobusesResponse;
import com.gabi.prueba.proyectoBase.dto.UsuarioResponse;
import com.gabi.prueba.proyectoBase.service.IUsuarioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(path = "/process")
public class UsuarioControllerImpl implements IUsuarioController{

	@Autowired
	IUsuarioService iUsuarioService;
	
	
	@Operation(description = "Busca por el ID del usuario solicitado")
	// códigos de respuesta swagger
	@ApiResponses(value = { 
			@ApiResponse(responseCode = "200", description = "Ok", content = @Content (schema = @Schema (implementation = AutobusesResponse.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "401", description = "Unauthorized"),
			@ApiResponse(responseCode = "403", description = "Forbidden"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal server error") })
	@Override
	@GetMapping("${app.rest.endpoints.buscarUsuarioId}")
	public ResponseEntity<UsuarioResponse> findUsuario(@PathVariable String id) {
		
		return ResponseEntity.ok(iUsuarioService.searchUsuario(id));
	}

}
