package com.gabi.prueba.proyectoBase.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class ConductorDto {

	
	private String nombre;
	
	private String apellidos;
	
	private String dni;
	
	private String numeroEmpleado;
	
	private String turno;
	
	private Date fichajeInicio;
	
	private Date fichajeFin;
}
