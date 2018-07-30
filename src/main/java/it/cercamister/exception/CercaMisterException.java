package it.cercamister.exception;

public class CercaMisterException extends RuntimeException {
	
	private static final long serialVersionUID = -4371234567250509912L;

	protected CercaMisterException() {
	}

	public CercaMisterException(String message) {
		super(message);
	}

	public CercaMisterException(String message, Throwable cause) {
		super(message, cause);
	}

	public CercaMisterException(Throwable cause) {
		super(cause);
	}
}
