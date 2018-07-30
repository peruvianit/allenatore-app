package it.cercamister.controller.rest;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import it.cercamister.dto.ComuneDTO;
import it.cercamister.dto.ProvinciaDTO;
import it.cercamister.dto.RegioneDTO;
import it.cercamister.service.ITerritorioService;

@RestController
@RequestMapping("/territorio")
public class TerritorioController {

	@Autowired
	ITerritorioService iTerritorioService;
	
	@GetMapping(value = "/regioni")
	public List<RegioneDTO> listaRegioneDTO() throws JsonProcessingException, IOException {
		return iTerritorioService.listaRegioneDTO();
	}
	
	@GetMapping(value = "/provincie/{codiceRegione}")
	public List<ProvinciaDTO> listaProvinciaDTO(@PathVariable("codiceRegione") String codiceRegione) throws JsonProcessingException, IOException {
		return iTerritorioService.listaProvinciaDTO(codiceRegione);
	}
	
	@GetMapping(value = "/comuni/{codiceProvincia}")
	public List<ComuneDTO> listaComuneDTO(@PathVariable("codiceProvincia") String codiceProvincia) throws JsonProcessingException, IOException {
		return iTerritorioService.listaComuneDTO(codiceProvincia);
	}
}
