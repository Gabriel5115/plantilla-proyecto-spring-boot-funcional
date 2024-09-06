package com.gabi.prueba.proyectoBase.exception;

public class CustomException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException(String mensaje) {
		super("CustomException: " + mensaje);
	}

}
