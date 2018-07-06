package it.peruvianit.mapper;

import it.peruvianit.dto.AllenatoreDTO;
import it.peruvianit.model.entity.AllenatoreEntity;
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
