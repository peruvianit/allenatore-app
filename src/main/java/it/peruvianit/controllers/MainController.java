package it.peruvianit.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import it.peruvianit.dto.AllenatoreDTO;
import it.peruvianit.service.IAllenatoreService;

@RestController
@RequestMapping("allenatore")
public class MainController {

	@Autowired
	IAllenatoreService iAllenatoreService;
	
	@PostMapping("/")
    public ResponseEntity<Object> index(@Valid @RequestBody AllenatoreDTO anagraficaAllenatoreDTO) {
		anagraficaAllenatoreDTO = iAllenatoreService.salvaAllenatore(anagraficaAllenatoreDTO);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(anagraficaAllenatoreDTO.getProgressivoAllenatore()).toUri();
		
        return ResponseEntity.created(location).build();
    }
}
