package it.peruvianit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.peruvianit.dto.AllenatoreDTO;
import it.peruvianit.mapper.IDtoToEntity;
import it.peruvianit.model.entity.AllenatoreEntity;
import it.peruvianit.model.repository.AllenatoreRepository;
import it.peruvianit.service.IAllenatoreService;

@Service
public class AllenatoreServiceImpl implements IAllenatoreService{

	@Autowired
	private AllenatoreRepository allenatoreRepository;
	
	@Autowired
	private IDtoToEntity iDtoToEntity;
	
	@Override
	public AllenatoreDTO salvaAllenatore(AllenatoreDTO allenatoreDTO) {
		
		AllenatoreEntity allenatoreEntity = iDtoToEntity.allenatoreDTOToAllenatoreEntity(allenatoreDTO);
		
		allenatoreRepository.save(allenatoreEntity);
		
		allenatoreDTO.setProgressivoAllenatore(allenatoreEntity.getId());
		
		return allenatoreDTO;
	}
}
