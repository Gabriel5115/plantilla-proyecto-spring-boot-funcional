package com.gabi.prueba.proyectoBase.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Clase RestTemplateConfig del proyectoBase
 * 
 * @author jcbellver
 *
 */
@Configuration
public class RestTemplateConfig {
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
