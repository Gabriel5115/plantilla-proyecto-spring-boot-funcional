package com.gabi.prueba.proyectoBase.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gabi.prueba.proyectoBase.service.IProyectoBaseService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

/**
 * Clase controladora del proyectoBase
 * 
 * @author jcbellver
 *
 */
@Controller
public class ProyectoBaseController {
	

	@Autowired
	private IProyectoBaseService service;

	/**
	 * Método de prueba
	 * 
	 * @return String
	 */
	@Operation(description = "Calls to ruta1")
	// códigos de respuesta swagger
	@ApiResponses(value = { @ApiResponse(responseCode = "204", description = "No Content"),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "401", description = "Unauthorized"),
			@ApiResponse(responseCode = "403", description = "Forbidden"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal server error") })	
	@GetMapping("${app.rest.endpoints.ruta1}")
	public String ruta1() {
		return "vista1";
	}

	/**
	 * Método de prueba que recibe un parametro en el body
	 * 
	 * @param parametro1 con el valor de parametro1
	 * 
	 * @return String
	 */
	@Operation(description = "Calls to ruta2")
	// body swagger
	@io.swagger.v3.oas.annotations.parameters.RequestBody(content = @Content(schema = @Schema(implementation = String.class)), required = true)
	// códigos de respuesta swagger
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = String.class))),
			@ApiResponse(responseCode = "204", description = "No Content"),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "401", description = "Unauthorized"),
			@ApiResponse(responseCode = "403", description = "Forbidden"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal server error") })
	@PostMapping("${app.rest.endpoints.ruta1}")
	public String ruta2(@Valid @RequestBody String parametro1) {
		return "vista2";
	}

}
