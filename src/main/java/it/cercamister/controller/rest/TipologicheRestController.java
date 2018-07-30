package it.cercamister.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.cercamister.dto.TipoLicenzaDTO;
import it.cercamister.service.ITipoLicenzaService;

@RestController
@Api(value="Tipologiche",description="Risorse Tipologiche")
@RequestMapping("/tipologiche")
@ApiResponses(value = {@ApiResponse(code = 401, message = "Non autorizzato"),
		   			   @ApiResponse(code = 403, message = "La richiesta è legittima ma il server si rifiuta di soddisfarla"),
		   			   @ApiResponse(code = 404, message = "La risorsa richiesta non è stata trovata ma in futuro potrebbe essere disponibile"),
		   			   @ApiResponse(code = 500, message = "Messaggio di errore generico senza alcun dettaglio")})
public class TipologicheRestController {

	@Autowired
	ITipoLicenzaService iTipoLicenzaService;
	
	@GetMapping("/tipo-licenze")
	@ApiOperation(value = "Lista di tipo licenze", response = TipoLicenzaDTO.class)
	public List<TipoLicenzaDTO> listaAllenatore() {
		return iTipoLicenzaService.listaTipoLicenze();
	}
	
}
