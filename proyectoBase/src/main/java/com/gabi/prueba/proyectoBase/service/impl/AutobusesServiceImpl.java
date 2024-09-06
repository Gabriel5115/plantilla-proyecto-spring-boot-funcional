package com.gabi.prueba.proyectoBase.service.impl;

import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabi.prueba.proyectoBase.dto.AutobusesDto;
import com.gabi.prueba.proyectoBase.dto.AutobusesListResponse;
import com.gabi.prueba.proyectoBase.dto.AutobusesResponse;
import com.gabi.prueba.proyectoBase.entity.AutobusesEntity;
import com.gabi.prueba.proyectoBase.exception.CustomException;
import com.gabi.prueba.proyectoBase.repository.AutobusesRepository;
import com.gabi.prueba.proyectoBase.service.IAutobusesService;
import com.gabi.prueba.proyectoBase.utils.MapperDTO;
import com.gabi.prueba.proyectoBase.utils.MapperEntity;

@Service
public class AutobusesServiceImpl implements IAutobusesService {

	private static final Logger log = LoggerFactory.getLogger(AutobusesServiceImpl.class);

	@Autowired
	AutobusesRepository autobusesRepository;

	@Override
	public AutobusesResponse searchAutobus(String id) {

		log.info("Buscamos el autobus con id {}", id);

		AutobusesResponse response = new AutobusesResponse();

		AutobusesEntity autobusesEntity = autobusesRepository.findByIdAutobus(id);

		response.setAutobusDto(MapperDTO.getAutobuses(autobusesEntity));

		return response;
	}

	@Override
	public void save(AutobusesDto dto) throws CustomException {

		log.info("Empieza el Save");

		log.info("Buscamos en la BBDD");

		AutobusesEntity procesoOptional = autobusesRepository.findByIdAutobus(dto.getIdAutobus());

		if (Objects.isNull(procesoOptional)) {
			log.info("save no se ha encontrado en BBDD");
			throw new CustomException("proceso no encontrado");
		}
		log.info("save mapeamos el objeto");
		AutobusesEntity autobusEntity = procesoOptional;
		autobusEntity = MapperEntity.getAutobusesEntity(autobusEntity, dto);
		autobusEntity.setIdAutobus(dto.getIdAutobus());
		autobusEntity.setMarcas(dto.getMarcas());
		autobusEntity.setModelos(dto.getModelos());
		autobusEntity.setAforo(dto.getAforo());

		log.info("save guardamos en la bbdd");
		autobusesRepository.save(autobusEntity);

		log.info("save fin");
	}

	@Override
	public void create(AutobusesDto dto) throws CustomException {
		log.info("Empieza el Create");

		log.info("Mapeamos el DTO a Entity");

		AutobusesEntity busEntity = new AutobusesEntity();
		busEntity = MapperEntity.getAutobusesEntity(busEntity, dto);
		busEntity.setIdAutobus(dto.getIdAutobus());
		busEntity.setMarcas(dto.getMarcas());
		busEntity.setModelos(dto.getModelos());
		busEntity.setAforo(dto.getAforo());

		log.info("Guardamos la Entity en la BBDD");
		autobusesRepository.save(busEntity);

		log.info("Create fin");

	}

	@Override
	public AutobusesListResponse listarAutobus(String marcas) throws CustomException {
		
		log.info("listarAutobus inicio");
		
		log.info("buscamos en la bbdd las marcas");
		
		AutobusesListResponse response = new AutobusesListResponse();
		List<AutobusesEntity> listaAutobusesEntity = autobusesRepository.findByMarcas(marcas);
		
		response.setTotalNumber(listaAutobusesEntity.size());
		log.info("mapeammos la lista a los DTO");
		response.setListaAutobuses(MapperDTO.getListaAutobuses(listaAutobusesEntity));
		
		log.info("listarAutobuses fin");
		
		return response;
	}

}
