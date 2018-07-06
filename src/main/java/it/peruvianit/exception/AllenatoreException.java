package it.peruvianit.exception;

public class AllenatoreException extends RuntimeException {
	
	private static final long serialVersionUID = -4371234567250509912L;

	protected AllenatoreException() {
	}

	public AllenatoreException(String message) {
		super(message);
	}

	public AllenatoreException(String message, Throwable cause) {
		super(message, cause);
	}

	public AllenatoreException(Throwable cause) {
		super(cause);
	}
}
