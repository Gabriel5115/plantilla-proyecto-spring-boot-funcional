package com.gabi.prueba.proyectoBase.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.gabi.prueba.proyectoBase.dto.ConductorResponse;

public interface IConductorController {

	
	ResponseEntity<ConductorResponse>finConductores(@PathVariable String numEmpleado);
}
