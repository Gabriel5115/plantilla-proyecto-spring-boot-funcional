package com.gabi.prueba.proyectoBase.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gabi.prueba.proyectoBase.repository.EjemploGetNetRepository;
import com.gabi.prueba.proyectoBase.service.IProyectoBaseService;

/**
 * Clase del service del proyectoBase
 * 
 * @author jcbellver
 *
 */
@Service
public class ProyectoBaseServiceImpl implements IProyectoBaseService {
	
	private static final Logger log = LoggerFactory.getLogger(ProyectoBaseServiceImpl.class);
	
	@Autowired
	private EjemploGetNetRepository vatRepository;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * Metodo que hace lo que tenga que hacer
	 * 
	 * @param parametro1 con el valor de parametro1
	 * @param parametro2 con el valor de parametro2
	 * 
	 * @return String
	 */
	@Override
	public String metodo1(String parametro1, String parametro2) {
		log.info("[metodo1] Entramos parametro1 {} parametro2 {}", parametro1, parametro2);		
		log.info("[metodo1] Salimos");
		return new String("");
	}

}
