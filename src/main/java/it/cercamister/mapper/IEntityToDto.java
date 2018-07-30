package it.cercamister.mapper;

import it.cercamister.dto.AllenatoreDTO;
import it.cercamister.model.entity.AllenatoreEntity;
/**
 * 
 * @author Sergio Arellano
 * 
 *
 */
public interface IEntityToDto {
	
	public AllenatoreDTO allenatoreEntityToAllenatoreDto(AllenatoreEntity allenatoreEntity);
}
