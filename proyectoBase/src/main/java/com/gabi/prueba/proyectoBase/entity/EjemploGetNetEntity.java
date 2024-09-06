package com.gabi.prueba.proyectoBase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase entidad de la tabla EJEMPLO_GETNET del proyectoBase
 * 
 * @author jcbellver
 *
 */
@Entity
@Table(name = "EJEMPLO_GETNET")
@Getter
@Setter
@ToString
public class EjemploGetNetEntity {
	
	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "FLAG")
	private boolean flag;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;

}
