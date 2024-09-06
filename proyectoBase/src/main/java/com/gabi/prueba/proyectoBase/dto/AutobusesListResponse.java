package com.gabi.prueba.proyectoBase.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AutobusesListResponse {
	
	private List<AutobusesDto> listaAutobuses;
	
	private int totalNumber;
	
}
