package com.gabi.prueba.proyectoBase.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

/**
 * Clase SwaggerConfig del proyectoBase
 * 
 * @author jcbellver
 *
 */
@Configuration
public class SwaggerConfig { 

    /**
     * Creates Springdoc object
     * where the API Documentation is grouped
     * by package and path pattern
     *
     * @return GroupedOpenApi
     */
    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("api-web")
                .packagesToScan("com.gabi.prueba.proyectoBase.controller")
                .build();
    }

    /**
     * Creates Springdoc object
     * where it is defined or described
     * the API definition.
     *
     * @return OpenAPI
     */
    @Bean
    public OpenAPI apiInfo(@Value("${app.nombreProyecto}") String nombreProyecto) {
        return new OpenAPI()
                .info(new Info().title(nombreProyecto)
                        .description("ProyectoBase Prueba Gabi Microservice")
                        .version("1.0.0-SNAPSHOT")
                );
    }	

}