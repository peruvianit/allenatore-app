package it.cercamister.exception;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.HttpStatus;

public class ApiError {	
	private HttpStatus status;
    private LocalDateTime timestamp;
    private String message;
    private String debugMessage;
    private List<String> errors;
    
    
    private ApiError() {
        timestamp = LocalDateTime.now();
    }

    public ApiError(HttpStatus status) {
        this();
        this.status = status;
    }

    public ApiError(HttpStatus status, Throwable ex) {
        this();
        this.status = status;
        this.message = "Unexpected error";
        this.debugMessage = ExceptionUtils.getStackTrace(ex);
    }

    public ApiError(HttpStatus status, String message, Throwable ex) {
        this();
        this.status = status;
        this.message = ExceptionUtils.getRootCauseMessage(ex);
        this.debugMessage = ExceptionUtils.getStackTrace(ex);
    }
    
    public ApiError(HttpStatus status, String message, Throwable ex, List<String> errors) {
        this();
        this.status = status;
        this.message = ExceptionUtils.getRootCauseMessage(ex);
        this.debugMessage = ExceptionUtils.getStackTrace(ex);
        this.errors = errors;
    }

    public ApiError(HttpStatus status, String message, Throwable ex, String error) {
        this();
        this.status = status;
        this.message = ExceptionUtils.getRootCauseMessage(ex);
        this.debugMessage = ExceptionUtils.getStackTrace(ex);
        this.errors = Arrays.asList(error);;
    }
    
	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDebugMessage() {
		return debugMessage;
	}

	public void setDebugMessage(String debugMessage) {
		this.debugMessage = debugMessage;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
   
}
