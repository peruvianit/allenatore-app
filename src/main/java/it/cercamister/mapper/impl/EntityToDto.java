package it.cercamister.mapper.impl;

import org.springframework.stereotype.Component;

import it.cercamister.dto.AllenatoreDTO;
import it.cercamister.dto.TipoLicenzaDTO;
import it.cercamister.mapper.IEntityToDto;
import it.cercamister.model.entity.AllenatoreEntity;

@Component
public class EntityToDto implements IEntityToDto {

	@Override
	public AllenatoreDTO allenatoreEntityToAllenatoreDto(AllenatoreEntity allenatoreEntity) {
		AllenatoreDTO allenatoreDTO = null;
		
		if ( allenatoreEntity != null ) {
			allenatoreDTO = new AllenatoreDTO();
			
			allenatoreDTO.setProgressivoAllenatore(allenatoreEntity.getId());
			
			Long licId = allenatoreEntity.getLicId();
			if ( licId != null ) {
				TipoLicenzaDTO tipoLicenzaDTO = new TipoLicenzaDTO();
				tipoLicenzaDTO.setProgressivoTipoLicenza(licId);
				allenatoreDTO.setTipoLicenzaDTO(tipoLicenzaDTO);				
			}
			
			allenatoreDTO.setNome(allenatoreEntity.getAllNome());
			allenatoreDTO.setCognome(allenatoreEntity.getAllCognome());
			allenatoreDTO.setNazione(allenatoreEntity.getAllNazione());
			allenatoreDTO.setCitta(allenatoreEntity.getAllCitta());
			allenatoreDTO.setDescrizioneIndirizzo(allenatoreEntity.getAllIndirizzo());
			allenatoreDTO.setEmail(allenatoreEntity.getAllEmail());
			allenatoreDTO.setTelefono(allenatoreEntity.getAllTelefono());
			allenatoreDTO.setFlagSpostaCitta(allenatoreEntity.getAllFlagTrasfertaCitta());
			allenatoreDTO.setFlagSpostaNazione(allenatoreEntity.getAllFlagTrasfertaNazione());
			allenatoreDTO.setFlagSpostaContinente(allenatoreEntity.getAllFlagTrasfertaContinente());
			
		}
		
		return allenatoreDTO;
	}

	
}
