package it.cercamister.controller.rest;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.cercamister.dto.AllenatoreDTO;
import it.cercamister.service.IAllenatoreService;

@RestController
@Api(value="Allenatori",description="Risorse Allenatori")
@RequestMapping("/v1.0/allenatori")
@ApiResponses(value = {@ApiResponse(code = 401, message = "Non autorizzato"),
		   			   @ApiResponse(code = 403, message = "La richiesta è legittima ma il server si rifiuta di soddisfarla"),
		   			   @ApiResponse(code = 404, message = "La risorsa richiesta non è stata trovata ma in futuro potrebbe essere disponibile"),
		   			   @ApiResponse(code = 500, message = "Messaggio di errore generico senza alcun dettaglio")})
public class AllenatoreRestController {

	@Autowired
	IAllenatoreService iAllenatoreService;
	
	@GetMapping()
	@ApiOperation(value = "Lista di allenatori", response = AllenatoreDTO.class)
	public List<AllenatoreDTO> listaAllenatore() {
		return iAllenatoreService.listaAllenatore();
	}
	
	@GetMapping("/{id}")
	@ApiOperation(value = "Ricerca Allenatore per ID", response = AllenatoreDTO.class)
	public AllenatoreDTO allenatoreById(@PathVariable("id") @ApiParam(value = "numero identificativo Allenatore") Long id) {
		return iAllenatoreService.allenatoreById(id);
	}
	
	@PostMapping()
	@ApiOperation(value = "Crea un nuovo allenatore")
	@ApiResponses(value = {@ApiResponse(code = 201, message = "La richiesta è stata soddisfatta, restituendo la creazione di una nuova risorsa"),
						   @ApiResponse(code = 400, message = "La richiesta non può essere soddisfatta a causa di errori di sintass")})
	@ResponseStatus(code=HttpStatus.CREATED)
    public ResponseEntity<Object> nuovo(@Valid @RequestBody @ApiParam(value = "Modello Allenatore") AllenatoreDTO allenatoreDTO) {
		allenatoreDTO = iAllenatoreService.salvaAllenatore(allenatoreDTO);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(allenatoreDTO.getProgressivoAllenatore()).toUri();
		
        return ResponseEntity.created(location).build();
    }
	
	@PutMapping("/{id}")
	@ApiOperation(value = "Modifica allenatore")
	@ApiResponses(value = {@ApiResponse(code = 204, message = "Il server ha processato con successo la richiesta e non restituirà nessun contenuto"),
						   @ApiResponse(code = 400, message = "La richiesta non può essere soddisfatta a causa di errori di sintass")})
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
    public ResponseEntity<Object> modifica(@Valid @RequestBody @ApiParam(value = "Modello Allenatore") AllenatoreDTO allenatoreDTO,
    									   @PathVariable("id") @ApiParam(value = "numero identificativo Allenatore") Long id) {
		allenatoreDTO.setProgressivoAllenatore(id);
		allenatoreDTO = iAllenatoreService.salvaAllenatore(allenatoreDTO);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
		
        return ResponseEntity.noContent().location(location).build();
    }
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Cancellazione allenatore")
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	public ResponseEntity<Object> cancella(@PathVariable("id") @ApiParam(value = "numero identificativo Allenatore") Long id) {
		iAllenatoreService.cancellaAllenatore(id);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
		
        return ResponseEntity.noContent().location(location).build();
    }
}
