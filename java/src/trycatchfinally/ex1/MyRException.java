package afinal.trycatchfinally.ex1;

class MyRException extends RuntimeException {

    public MyRException() {
        super();
    }

    public MyRException(String message) {
        super(message);
    }
}

class MyException extends Exception {

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
