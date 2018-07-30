package it.cercamister.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.cercamister.dto.AllenatoreDTO;
import it.cercamister.exception.AllenatoreNotFoundException;
import it.cercamister.mapper.IDtoToEntity;
import it.cercamister.mapper.IEntityToDto;
import it.cercamister.model.entity.AllenatoreEntity;
import it.cercamister.model.repository.AllenatoreRepository;
import it.cercamister.service.IAllenatoreService;

@Service
public class AllenatoreServiceImpl implements IAllenatoreService{

	@Autowired
	private AllenatoreRepository allenatoreRepository;
	
	@Autowired
	private IDtoToEntity iDtoToEntity;
	
	@Autowired
	private IEntityToDto iEntityToDto;
	
	@Override
	public AllenatoreDTO salvaAllenatore(AllenatoreDTO allenatoreDTO) {
		
		Long progressivoAllenatore = allenatoreDTO.getProgressivoAllenatore();
		
		if ( progressivoAllenatore != null ) {
			Optional<AllenatoreEntity> allenatoreEntity = allenatoreRepository.findById(progressivoAllenatore);
			
			if (!allenatoreEntity.isPresent()) {
				throw new AllenatoreNotFoundException(progressivoAllenatore.toString());
			}
		}
		
		AllenatoreEntity allenatoreEntity = iDtoToEntity.allenatoreDTOToAllenatoreEntity(allenatoreDTO);
		
		allenatoreRepository.save(allenatoreEntity);
		
		allenatoreDTO.setProgressivoAllenatore(allenatoreEntity.getId());
		
		return allenatoreDTO;
	}

	@Override
	public List<AllenatoreDTO> listaAllenatore() {
		List<AllenatoreDTO> listAllenatoreDTO = new ArrayList<>();		
		List<AllenatoreEntity> listAllenatore = allenatoreRepository.findAll();
		
		if ( listAllenatore.size() > 0 ) {
			for (AllenatoreEntity allenatoreEntity : listAllenatore) {
				listAllenatoreDTO.add(iEntityToDto.allenatoreEntityToAllenatoreDto(allenatoreEntity));
			}
		}
		
		return listAllenatoreDTO;
	}

	@Override
	public AllenatoreDTO allenatoreById(Long progressivoAllenatore) {
		Optional<AllenatoreEntity> allenatoreEntity  = allenatoreRepository.findById(progressivoAllenatore);
		
		if (!allenatoreEntity.isPresent()) {
			throw new AllenatoreNotFoundException(progressivoAllenatore.toString());
		}
		
		return iEntityToDto.allenatoreEntityToAllenatoreDto(allenatoreEntity.get());
	}

	@Override
	public void cancellaAllenatore(Long progressivoAllenatore) {
		Optional<AllenatoreEntity> allenatoreEntity  = allenatoreRepository.findById(progressivoAllenatore);
		
		if (!allenatoreEntity.isPresent()) {
			throw new AllenatoreNotFoundException(progressivoAllenatore.toString());
		}
		
		allenatoreRepository.delete(allenatoreEntity.get());
	}
}
