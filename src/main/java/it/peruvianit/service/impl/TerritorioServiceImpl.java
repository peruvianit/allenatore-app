package it.peruvianit.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.peruvianit.dto.ComuneDTO;
import it.peruvianit.dto.ListaStudentiDTO;
import it.peruvianit.dto.ProvinciaDTO;
import it.peruvianit.service.ITerritorioService;

@Service
public class TerritorioServiceImpl implements ITerritorioService{

	private final Logger logger = LoggerFactory.getLogger(TerritorioServiceImpl.class);
   
    
    private HttpHeaders createHttpHeaders()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Cache-Control", "no-cache");
        return headers;
    }

	@Override
	public ListaStudentiDTO listaRegioneDTO() throws IOException {
    	String theUrl = "";
    	RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = createHttpHeaders();
        ObjectMapper mapper = new ObjectMapper();
        List<?> dtoRichL = new ArrayList<String>();
			String	jsonStr = mapper.writeValueAsString(dtoRichL);
			 HttpEntity<String> entity = new HttpEntity<String>(jsonStr, headers);
			 ResponseEntity<String> response = restTemplate.exchange(theUrl, HttpMethod.GET, entity, String.class);
			 ListaStudentiDTO rit =  mapper.readValue(response.getBody(), ListaStudentiDTO.class);
			return rit;
	}

	@Override
	public List<ProvinciaDTO> listaProvinciaDTO(String codiceRegione) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ComuneDTO> listaComuneDTO(String codiceProvincia) {
		// TODO Auto-generated method stub
		return null;
	}

    
    
}