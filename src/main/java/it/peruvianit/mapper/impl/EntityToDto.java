package it.peruvianit.mapper.impl;

import org.springframework.stereotype.Component;

import it.peruvianit.dto.AllenatoreDTO;
import it.peruvianit.dto.TipoLicenzaDTO;
import it.peruvianit.mapper.IEntityToDto;
import it.peruvianit.model.entity.AllenatoreEntity;

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
				TipoLicenzaDTO tipoLicenzaDTO = allenatoreDTO.getTipoLicenzaDTO();
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
			allenatoreDTO.setFlgaSpostaCitta(allenatoreEntity.getAllFlagTrasfertaCitta());
			allenatoreDTO.setFlgaSpostaNazione(allenatoreEntity.getAllFlagTrasfertaNazione());
			allenatoreDTO.setFlgaSpostaContinente(allenatoreEntity.getAllFlagTrasfertaContinente());
			
		}
		
		return allenatoreDTO;
	}

	
}