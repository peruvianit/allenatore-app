package it.peruvianit.controller.rest;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.annotations.Api;
import it.peruvianit.dto.AllenatoreDTO;
import it.peruvianit.service.IAllenatoreService;

@RestController
@Api(value="Allenatori",description="Risorse per ritornare le informaizoni dei allenatori")
@RequestMapping("allenatori")
public class AllenatoreRestController {

	@Autowired
	IAllenatoreService iAllenatoreService;
	
	@GetMapping()
	public List<AllenatoreDTO> listaAllenatore() {
		return iAllenatoreService.listaAllenatore();
	}
	
	@GetMapping("/{id}")
	public AllenatoreDTO allenatoreById(@PathVariable("id") Long id) {
		return iAllenatoreService.allenatoreById(id);
	}
	
	@PostMapping()
    public ResponseEntity<Object> nuovo(@Valid @RequestBody AllenatoreDTO allenatoreDTO) {
		allenatoreDTO = iAllenatoreService.salvaAllenatore(allenatoreDTO);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(allenatoreDTO.getProgressivoAllenatore()).toUri();
		
        return ResponseEntity.created(location).build();
    }
	
	@PutMapping("/{id}")
    public ResponseEntity<Object> modifica(@Valid @RequestBody AllenatoreDTO allenatoreDTO,
    									   @PathVariable("id") Long id) {
		allenatoreDTO.setProgressivoAllenatore(id);
		allenatoreDTO = iAllenatoreService.salvaAllenatore(allenatoreDTO);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
		
        return ResponseEntity.noContent().location(location).build();
    }
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> cancella(@PathVariable("id") Long id) {
		iAllenatoreService.cancellaAllenatore(id);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
		
        return ResponseEntity.noContent().location(location).build();
    }
}
