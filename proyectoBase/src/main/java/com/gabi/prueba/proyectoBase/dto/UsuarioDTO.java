package com.gabi.prueba.proyectoBase.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UsuarioDTO {
	
	private int id;
	
	private String idUsuario;
	
	private String username;
	
	private String role;
	
}
