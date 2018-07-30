package it.cercamister.service;

import java.util.List;

import it.cercamister.dto.AllenatoreDTO;

public interface IAllenatoreService {
	
	public List<AllenatoreDTO> listaAllenatore();
	
	public AllenatoreDTO allenatoreById(Long progressivoAllenatore);
	
	public AllenatoreDTO salvaAllenatore(AllenatoreDTO allenatoreDTO);
	
	public void cancellaAllenatore(Long progressivoAllenatore);
	
}