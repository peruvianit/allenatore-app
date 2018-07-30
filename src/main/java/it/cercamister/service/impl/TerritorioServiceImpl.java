package it.cercamister.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.cercamister.dto.ComuneDTO;
import it.cercamister.dto.ProvinciaDTO;
import it.cercamister.dto.RegioneDTO;
import it.cercamister.service.ITerritorioService;

@Service
public class TerritorioServiceImpl implements ITerritorioService{

	private final Logger logger = LoggerFactory.getLogger(TerritorioServiceImpl.class);
	@Value("${rest.service.host}")
	private String host;
	@Value("${rest.service.port}")
	private String port;
	@Value("${rest.service.context}")
	private String context;
	@Value("${rest.service.regioni}")
	private String regioni;
	@Value("${rest.service.provincie}")
	private String provincie;
	@Value("${rest.service.comuni}")
	private String comuni;
	
    private HttpHeaders createHttpHeaders()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Cache-Control", "no-cache");
        return headers;
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<RegioneDTO> listaRegioneDTO() throws IOException {
		List<RegioneDTO> listRegioneDTO = new ArrayList<>();	
		RegioneDTO target = new RegioneDTO() ;
		String theUrl = host+port+context+regioni;
		logger.debug("theUrl ---> "+theUrl);
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = createHttpHeaders();
		ObjectMapper mapper = new ObjectMapper();
			 HttpEntity<String> entity = new HttpEntity<String>("", headers);
			 ResponseEntity<String> response = restTemplate.exchange(theUrl, HttpMethod.GET, entity, String.class);
			 JavaType type = mapper.getTypeFactory().constructCollectionType(ArrayList.class, target.getClass()) ;
			 listRegioneDTO =  (ArrayList<RegioneDTO>)mapper.readValue(response.getBody(), type);
		return listRegioneDTO;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProvinciaDTO> listaProvinciaDTO(String codiceRegione) throws IOException {
		List<ProvinciaDTO> listProvinciaDTO = new ArrayList<>();	
		ProvinciaDTO target = new ProvinciaDTO() ;
		String theUrl = host+port+context+provincie+codiceRegione;
		logger.debug("theUrl ---> "+theUrl);
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = createHttpHeaders();
		ObjectMapper mapper = new ObjectMapper();
			 HttpEntity<String> entity = new HttpEntity<String>("", headers);
			 ResponseEntity<String> response = restTemplate.exchange(theUrl, HttpMethod.GET, entity, String.class);
			 JavaType type = mapper.getTypeFactory().constructCollectionType(ArrayList.class, target.getClass()) ;
			 listProvinciaDTO =  (ArrayList<ProvinciaDTO>)mapper.readValue(response.getBody(), type);
		return listProvinciaDTO;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ComuneDTO> listaComuneDTO(String codiceProvincia) throws IOException {
		List<ComuneDTO> listComuneDTO = new ArrayList<>();	
		ComuneDTO target = new ComuneDTO() ;
		String theUrl = host+port+context+comuni+codiceProvincia;
		logger.debug("theUrl ---> "+theUrl);
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = createHttpHeaders();
		ObjectMapper mapper = new ObjectMapper();
			 HttpEntity<String> entity = new HttpEntity<String>("", headers);
			 ResponseEntity<String> response = restTemplate.exchange(theUrl, HttpMethod.GET, entity, String.class);
			 JavaType type = mapper.getTypeFactory().constructCollectionType(ArrayList.class, target.getClass()) ;
			 listComuneDTO =  (ArrayList<ComuneDTO>)mapper.readValue(response.getBody(), type);
		return listComuneDTO;
	}

    
    
}