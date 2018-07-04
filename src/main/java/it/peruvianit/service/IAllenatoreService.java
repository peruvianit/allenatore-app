package it.peruvianit.service;

import it.peruvianit.dto.AllenatoreDTO;

public interface IAllenatoreService {
	
	/**
	 * 
	 * @param anagraficaAllenatoreDTO codice gestito dall'applicazione "SBVB"
	 * 
	 * @version 1.0.1
	 */
	
	public AllenatoreDTO salvaAllenatore(AllenatoreDTO allenatoreDTO);
}