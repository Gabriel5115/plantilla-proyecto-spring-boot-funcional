package com.gabi.prueba.proyectoBase.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.gabi.prueba.proyectoBase.dto.LoginRequest;
import com.gabi.prueba.proyectoBase.dto.LoginRequestDto;

public interface ILoginController {

	ResponseEntity<LoginRequestDto>login(@RequestBody LoginRequest request);
}
