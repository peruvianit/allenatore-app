package it.peruvianit.advice;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import it.peruvianit.exception.AllenatoreException;

@ControllerAdvice
public class AllenatoreControllerAdvice extends ResponseEntityExceptionHandler {
	@ExceptionHandler({ AllenatoreException.class })
	protected ResponseEntity<Object> handleFatturaServiceException(RuntimeException e, WebRequest request) {

		// TODO DA IMPLEMENTARE
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		 
		return handleExceptionInternal(e, null, headers,HttpStatus.UNPROCESSABLE_ENTITY, request);
	}
}
