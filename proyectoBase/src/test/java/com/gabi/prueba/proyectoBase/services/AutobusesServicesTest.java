package com.gabi.prueba.proyectoBase.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentCaptor.forClass;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.gabi.prueba.proyectoBase.dto.AutobusesDto;
import com.gabi.prueba.proyectoBase.dto.AutobusesListResponse;
import com.gabi.prueba.proyectoBase.entity.AutobusesEntity;
import com.gabi.prueba.proyectoBase.exception.CustomException;
import com.gabi.prueba.proyectoBase.repository.AutobusesRepository;
import com.gabi.prueba.proyectoBase.service.impl.AutobusesServiceImpl;

@ExtendWith(MockitoExtension.class)
public class AutobusesServicesTest {

	@Mock
	private AutobusesRepository autobusRepository;

	@Mock
	private DozerBeanMapper mapper;

	@InjectMocks
	private AutobusesServiceImpl autobusServiceImpl;

	private AutobusesDto autobus1;
	private AutobusesDto autobus2;
	private AutobusesEntity bus1;
	private AutobusesEntity bus2;
	private List<AutobusesEntity> autobusResponse;
	private AutobusesListResponse autobusesListResponse;
	private String marca;

	@BeforeEach
	public void init() throws CustomException {
		initMocks();
	}

	@Test
	public void testCreate() throws CustomException {

		// Preparamos el mock para que cuando se llame a save, devuelva bus1
		when(autobusRepository.save(any(AutobusesEntity.class))).thenReturn(bus1);

		// Ejecutamos el método a probar
		autobusServiceImpl.create(autobus1);

		// Verificamos que el repositorio fue llamado correctamente
		ArgumentCaptor<AutobusesEntity> captor = forClass(AutobusesEntity.class);
		verify(autobusRepository).save(captor.capture());

		// Capturamos el objeto que se guardó
		AutobusesEntity savedBus = captor.getValue();

		// Imprimir el objeto capturado para verificar sus datos
		System.out.println(savedBus);

	}

	@Test
	public void listarMarca() throws CustomException {

		when(autobusRepository.findByMarcas(marca)).thenReturn(autobusResponse);
		
		
		
		AutobusesListResponse autobuses = autobusServiceImpl.listarAutobus(marca);
		
		System.out.println(autobuses);
		
		assertNotNull(autobuses);
		assertEquals(2, autobuses.getTotalNumber());
		assertNotNull(autobuses.getListaAutobuses());
		assertNotNull(autobuses.getListaAutobuses().get(0));
		assertNotNull(autobuses.getListaAutobuses().get(1));
	}

	private void initMocks() throws CustomException {

		bus1 = new AutobusesEntity();
		bus2 = new AutobusesEntity();

		autobus1 = new AutobusesDto();
		autobus1.setIdent(0);
		autobus1.setIdAutobus("Q20177M");
		autobus1.setMarcas("Volkswagen");
		autobus1.setModelos("R213");
		autobus1.setAforo(300);

		autobus2 = new AutobusesDto();
		autobus2.setIdAutobus("P5216L");
		autobus2.setMarcas("Mercedes");
		autobus2.setModelos("Q258");
		autobus2.setAforo(50);

		autobusResponse = new ArrayList<>();
		autobusesListResponse = new AutobusesListResponse();
		
		autobusResponse.add(bus1);
		autobusResponse.add(bus2);
		
		marca = "Mercedes";
		

	}
}
