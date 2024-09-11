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
@Table(name = "USUARIOS")
@Getter
@Setter
@ToString
public class UsuarioEntity {

	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ident;
	
	@Column(name = "ID_USUARIO")
	private String idUsuario;
	
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "ROLE")
	private String role;
}
