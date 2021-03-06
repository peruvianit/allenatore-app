package it.cercamister.exception;

public class AllenatoreNotFoundException extends CercaMisterException {
	
	private static final long serialVersionUID = -4371234567250509912L;

	protected AllenatoreNotFoundException() {
	}

	public AllenatoreNotFoundException(String message) {
		super(message);
	}

	public AllenatoreNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public AllenatoreNotFoundException(Throwable cause) {
		super(cause);
	}
}
