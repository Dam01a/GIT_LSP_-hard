package org.howard.edu.lsp.assignment5;

public class IntegerSetException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
    public IntegerSetException() {
        super();
    }

    public IntegerSetException(String message) {
        super(message);
    }

    public IntegerSetException(String message, Throwable cause) {
        super(message, cause);
    }

    public IntegerSetException(Throwable cause) {
        super(cause);
    }
}
