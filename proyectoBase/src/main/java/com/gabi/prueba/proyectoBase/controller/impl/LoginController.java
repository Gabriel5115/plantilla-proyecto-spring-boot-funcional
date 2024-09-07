package com.gabi.prueba.proyectoBase.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabi.prueba.proyectoBase.controller.ILoginController;
import com.gabi.prueba.proyectoBase.dto.AutobusesResponse;
import com.gabi.prueba.proyectoBase.dto.LoginRequest;
import com.gabi.prueba.proyectoBase.dto.LoginRequestDto;
import com.gabi.prueba.proyectoBase.entity.UserLoginEntity;
import com.gabi.prueba.proyectoBase.repository.UserRolRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class LoginController implements ILoginController{
	
	
	@Autowired
	UserRolRepository userRolRepository;
	
	@Operation(description = "Login del usuario")
	// códigos de respuesta swagger
	@ApiResponses(value = { 
			@ApiResponse(responseCode = "200", description = "Ok", content = @Content (schema = @Schema (implementation = AutobusesResponse.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "401", description = "Unauthorized"),
			@ApiResponse(responseCode = "403", description = "Forbidden"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal server error") })
	@PostMapping("${app.rest.endpoints.login}")
	@Override
	public ResponseEntity<LoginRequestDto> login(LoginRequest request) {
		
		LoginRequestDto response = new LoginRequestDto();
		
		UserLoginEntity credenciales = userRolRepository.findOneByUsernameAndPassword(request.getUser(), request.getPassword());
		
		if (credenciales != null && credenciales.getRole() != null && credenciales.getGroups() != null) {
			response.setGroup(credenciales.getGroups());
			response.setRole(credenciales.getRole());
			return ResponseEntity.ok(response);
		} else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
		
		
	}

}
