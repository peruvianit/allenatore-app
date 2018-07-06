package it.peruvianit.mapper;

import it.peruvianit.dto.AllenatoreDTO;
import it.peruvianit.model.entity.AllenatoreEntity;
/**
 * 
 * @author Sergio Arellano
 * 
 *
 */
public interface IEntityToDto {
	
	public AllenatoreDTO allenatoreEntityToAllenatoreDto(AllenatoreEntity allenatoreEntity);
}
