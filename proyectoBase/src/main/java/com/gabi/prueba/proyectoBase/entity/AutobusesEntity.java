package com.gabi.prueba.proyectoBase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "AUTOBUSES")
@Getter
@Setter
@ToString
public class AutobusesEntity {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long ident;
	
	@Column(name="ID_AUTOBUS")
	private String idAutobus;
	
	@Column(name="MARCAS")
	private String marcas;
	
	@Column(name="MODELOS")
	private String modelos;
	
	@Column(name="AFORO")
	private int aforo;
	
	
}
