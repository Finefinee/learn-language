package afinal.trycatchfinally.ex1;

class MinusException extends RuntimeException {

    public MinusException() {
    }

    public MinusException(String message) {
        super(message);
    }
}

class OverException extends RuntimeException {

    public OverException() {
    }

    public OverException(String message) {
        super(message);
    }
}
