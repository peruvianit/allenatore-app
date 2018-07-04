package it.peruvianit.mapper;

import it.peruvianit.dto.AllenatoreDTO;
import it.peruvianit.model.entity.AllenatoreEntity;

public interface IDtoToEntity {
	public AllenatoreEntity allenatoreDTOToAllenatoreEntity(AllenatoreDTO allenatoreDTO);
}
