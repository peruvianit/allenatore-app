package it.peruvianit.controller.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import it.peruvianit.dto.ListaStudentiDTO;
import it.peruvianit.service.ITerritorioService;

@RestController
@RequestMapping("/territorio")
public class TerritorioController {

	@Autowired
	ITerritorioService iTerritorioService;
	
	@GetMapping(value = "/regioni")
	public ListaStudentiDTO listaRegioneDTO() throws JsonProcessingException, IOException {
		return iTerritorioService.listaRegioneDTO();
	}
	
//	@GetMapping(value = "/provincie/{codiceRegione}")
//	public List<ProvinciaDTO> listaProvinciaDTO(@PathVariable("codiceRegione") String codiceRegione) {
//		return iIstatService.listaProvinciaDTO(codiceRegione);
//	}
//	
//	@GetMapping(value = "/comuni/{codiceProvincia}")
//	public List<ComuneDTO> listaComuneDTO(@PathVariable("codiceProvincia") String codiceProvincia) {
//		return iIstatService.listaComuneDTO(codiceProvincia);
//	}
}
