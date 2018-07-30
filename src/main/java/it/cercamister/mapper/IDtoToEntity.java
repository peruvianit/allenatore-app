package it.cercamister.mapper;

import it.cercamister.dto.AllenatoreDTO;
import it.cercamister.model.entity.AllenatoreEntity;
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
}
