package com.gabi.prueba.proyectoBase.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginDto {
	
	private String username;
	private String password;
	private String rol;
}
