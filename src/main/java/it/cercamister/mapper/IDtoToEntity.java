package it.cercamister.mapper;

import it.cercamister.dto.AllenatoreDTO;
import it.cercamister.dto.RegistrazioneDTO;
import it.cercamister.model.entity.AllenatoreEntity;
import it.cercamister.model.entity.RegistrazioneEntity;
/**
 * 
 * @author Sergio Arellano
 * 
 *
 */
public interface IDtoToEntity {
	
	/**
	 * 
	 * @param allenatoreDTO 
	 * 
	 * @return Entity Allenatore
	 */
	public AllenatoreEntity allenatoreDTOToAllenatoreEntity(AllenatoreDTO allenatoreDTO);
	
	public RegistrazioneEntity registrazioneDTOToRegistrazioneEntity(RegistrazioneDTO registrazioneDTO);
	
}
