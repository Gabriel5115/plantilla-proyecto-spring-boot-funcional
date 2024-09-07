package com.gabi.prueba.proyectoBase.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CONDUCTORES")
@Getter
@Setter
@ToString
public class ConductorEntity {

	@Column(name = "DNI")
	private String dni;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDOS")
	private String apellidos;
	
	@Column(name = "NUMERO_EMPLEADO")
	private String numeroEmpleado;
	
	@Column(name = "TURNO")
	private String turno;
	
	@Column(name = "FICHAJE_INICIO")
	private Date fichajeInicio;
	
	@Column(name = "FICHAJE_FIN")
	private Date fichajeFin;
}
