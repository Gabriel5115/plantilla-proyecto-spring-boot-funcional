package com.gabi.prueba.proyectoBase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Clase GetNetApplication del proyectoBase
 * 
 * @author jcbellver
 *
 */
@SpringBootApplication
public class GetNetApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GetNetApplication.class, args);
	}

	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
    	return builder.properties("logging.file.path:optional:classpath:/,${RUTA}/config/proyectoBase/logback.xml")
    	.properties("spring.config.location:optional:classpath:/,${RUTA}/config/proyectoBase/").sources(GetNetApplication.class);
    }
}
