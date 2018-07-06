package it.peruvianit.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.peruvianit.dto.AllenatoreDTO;
import it.peruvianit.exception.AllenatoreNotFoundException;
import it.peruvianit.mapper.IDtoToEntity;
import it.peruvianit.mapper.IEntityToDto;
import it.peruvianit.model.entity.AllenatoreEntity;
import it.peruvianit.model.repository.AllenatoreRepository;
import it.peruvianit.service.IAllenatoreService;

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
		
		if (allenatoreEntity == null ) {
			throw new AllenatoreNotFoundException(progressivoAllenatore.toString());
		}
		
		return iEntityToDto.allenatoreEntityToAllenatoreDto(allenatoreEntity.get());
	}

	@Override
	public void cancellaAllenatore(Long progressivoAllenatore) {
		Optional<AllenatoreEntity> allenatoreEntity  = allenatoreRepository.findById(progressivoAllenatore);
		
		if (allenatoreEntity != null ) {
			allenatoreRepository.delete(allenatoreEntity.get());
		}else {
			throw new AllenatoreNotFoundException(progressivoAllenatore.toString());
		}
	}
}
