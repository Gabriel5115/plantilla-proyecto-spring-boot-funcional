package com.gabi.prueba.proyectoBase.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase EjemploGetNetDTO del proyectoBase
 * 
 * @author jcbellver
 *
 */
@Getter
@Setter
@ToString
public class EjemploGetNetDTO {
	
	@JsonProperty("attribute1")
	private String attribute1;
	
	@JsonProperty("attribute2")
	private String attribute2;

}
