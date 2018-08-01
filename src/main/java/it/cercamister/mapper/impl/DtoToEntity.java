package it.cercamister.mapper.impl;

import java.util.UUID;

import org.springframework.stereotype.Component;

import it.cercamister.dto.AllenatoreDTO;
import it.cercamister.dto.RegistrazioneDTO;
import it.cercamister.dto.TipoLicenzaDTO;
import it.cercamister.helper.EntityHelper;
import it.cercamister.mapper.IDtoToEntity;
import it.cercamister.model.entity.AllenatoreEntity;
import it.cercamister.model.entity.RegistrazioneEntity;

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
			allenatoreEntity.setAllFlagTrasfertaCitta(EntityHelper.ToFlasgString(allenatoreDTO.getFlagSpostaCitta()));
			allenatoreEntity.setAllFlagTrasfertaNazione(EntityHelper.ToFlasgString(allenatoreDTO.getFlagSpostaNazione()));
			allenatoreEntity.setAllFlagTrasfertaContinente(EntityHelper.ToFlasgString(allenatoreDTO.getFlagSpostaContinente()));
		}
		
		return allenatoreEntity;
	}

	@Override
	public RegistrazioneEntity registrazioneDTOToRegistrazioneEntity(RegistrazioneDTO registrazioneDTO) {
		RegistrazioneEntity registrazioneEntity = null;
		
		if ( registrazioneDTO != null ) {
			registrazioneEntity = new RegistrazioneEntity();
			
			registrazioneEntity.setId(registrazioneDTO.getProgressivoRegistrazione());
			
			TipoLicenzaDTO tipoLicenzaDTO = registrazioneDTO.getTipoLicenzaDTO();
			if ( tipoLicenzaDTO != null && tipoLicenzaDTO.getProgressivoTipoLicenza() != null ) {
				registrazioneEntity.setLicId(tipoLicenzaDTO.getProgressivoTipoLicenza());
			}
			
			registrazioneEntity.setNome(registrazioneDTO.getNome());
			registrazioneEntity.setCognome(registrazioneDTO.getCognome());
			registrazioneEntity.setNazione(registrazioneDTO.getNazione());
			registrazioneEntity.setCitta(registrazioneDTO.getCitta());
			registrazioneEntity.setIndirizzo(registrazioneDTO.getDescrizioneIndirizzo());
			registrazioneEntity.setEmail(registrazioneDTO.getEmail());
			registrazioneEntity.setTelefono(registrazioneDTO.getTelefono());
			registrazioneEntity.setFlagTrasfertaCitta(EntityHelper.ToFlasgString(registrazioneDTO.getFlagSpostaCitta()));
			registrazioneEntity.setFlagTrasfertaNazione(EntityHelper.ToFlasgString(registrazioneDTO.getFlagSpostaNazione()));
			registrazioneEntity.setFlagTrasfertaContinente(EntityHelper.ToFlasgString(registrazioneDTO.getFlagSpostaContinente()));
			registrazioneEntity.setConfirmazioneToken(UUID.randomUUID().toString());
		}
		
		return registrazioneEntity;
	}

}
