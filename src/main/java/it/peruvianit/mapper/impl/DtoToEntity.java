package it.peruvianit.mapper.impl;

import org.springframework.stereotype.Component;

import it.peruvianit.dto.AllenatoreDTO;
import it.peruvianit.dto.TipoLicenzaDTO;
import it.peruvianit.mapper.IDtoToEntity;
import it.peruvianit.model.entity.AllenatoreEntity;

@Component
public class DtoToEntity implements IDtoToEntity {

	@Override
	public AllenatoreEntity allenatoreDTOToAllenatoreEntity(AllenatoreDTO allenatoreDTO) {
		AllenatoreEntity allenatoreEntity = null;
		
		if ( allenatoreDTO != null ) {
			allenatoreEntity = new AllenatoreEntity();
			
			allenatoreEntity.setId(allenatoreDTO.getProgressivoAllenatore());
			
			TipoLicenzaDTO tipoLicenzaDTO = allenatoreDTO.getTipoLicenzaDTO();
			if ( tipoLicenzaDTO != null && tipoLicenzaDTO.getProgressivoTipoLicenza() != null ) {
				allenatoreEntity.setLicId(tipoLicenzaDTO.getProgressivoTipoLicenza());
			}
			
			allenatoreEntity.setAllNome(allenatoreDTO.getNome());
			allenatoreEntity.setAllCognome(allenatoreDTO.getCognome());
			allenatoreEntity.setAllNazione(allenatoreDTO.getNazione());
			allenatoreEntity.setAllCitta(allenatoreDTO.getCitta());
			allenatoreEntity.setAllIndirizzo(allenatoreDTO.getDescrizioneIndirizzo());
			allenatoreEntity.setAllEmail(allenatoreDTO.getEmail());
			allenatoreEntity.setAllTelefono(allenatoreDTO.getTelefono());
			allenatoreEntity.setAllFlagTrasfertaCitta(allenatoreDTO.getFlgaSpostaCitta());
			allenatoreEntity.setAllFlagTrasfertaNazione(allenatoreDTO.getFlgaSpostaNazione());
			allenatoreEntity.setAllFlagTrasfertaContinente(allenatoreDTO.getFlgaSpostaContinente());
		}
		
		return allenatoreEntity;
	}

}
