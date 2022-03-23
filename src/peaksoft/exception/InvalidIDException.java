package peaksoft.exception;

public class  InvalidIDException extends RuntimeException {

    public InvalidIDException() {
    }

    public InvalidIDException(String message) {
        System.err.println(message);
    }
}
