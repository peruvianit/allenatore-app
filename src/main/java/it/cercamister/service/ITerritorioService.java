package it.cercamister.service;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import it.cercamister.dto.ComuneDTO;
import it.cercamister.dto.ProvinciaDTO;
import it.cercamister.dto.RegioneDTO;

public interface ITerritorioService {
	
	public List<RegioneDTO> listaRegioneDTO() throws JsonProcessingException, IOException;
	
	public List<ProvinciaDTO> listaProvinciaDTO(String codiceRegione) throws JsonProcessingException, IOException;
	
	public List<ComuneDTO> listaComuneDTO(String codiceProvincia) throws JsonProcessingException, IOException;
	
}