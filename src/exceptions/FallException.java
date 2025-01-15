package exceptions;

public class FallException extends Exception {
    private final double random;

    public FallException(double random) {
        this.random = random;
        getMessage();
    }

    @Override
    public String getMessage() {
        return String.format("FallException: %.3f человек упал", random);
    }
}
