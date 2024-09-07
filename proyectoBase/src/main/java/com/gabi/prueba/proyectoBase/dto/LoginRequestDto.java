package com.gabi.prueba.proyectoBase.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginRequestDto {
	
	private String group;
	private String role;
}
