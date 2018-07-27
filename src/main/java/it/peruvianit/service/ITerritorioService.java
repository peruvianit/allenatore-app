package it.peruvianit.service;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import it.peruvianit.dto.ComuneDTO;
import it.peruvianit.dto.ListaStudentiDTO;
import it.peruvianit.dto.ProvinciaDTO;

public interface ITerritorioService {
	
	public ListaStudentiDTO listaRegioneDTO() throws JsonProcessingException, IOException;
	
	public List<ProvinciaDTO> listaProvinciaDTO(String codiceRegione);
	
	public List<ComuneDTO> listaComuneDTO(String codiceProvincia);
	
}