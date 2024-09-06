package com.gabi.prueba.proyectoBase.dto.internal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase EjemploInternalGetNetDTO del proyectoBase para interaccion con tercero
 * 
 * @author jcbellver
 *
 */
@Getter
@Setter
@ToString
public class EjemploInternalGetNetDTO {
	
	@JsonProperty("attribute1")
	private String attribute1;
	
	@JsonProperty("attribute2")
	private String attribute2;

}
