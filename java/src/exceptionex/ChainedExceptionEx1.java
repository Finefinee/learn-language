package exceptionex;

public class ChainedExceptionEx1 {
    public static void main(String[] args) {
        try {
            install();
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
    }

    public static void install() throws RuntimeException {
        try {
            throw new Exception();
        } catch (Exception ex) {
            RuntimeException runtimeException = new RuntimeException();
            runtimeException.initCause(ex);
            throw runtimeException;
        } catch (Throwable e) {
            RuntimeException runtimeException = new RuntimeException(e);
            runtimeException.initCause(e);
            throw runtimeException;
        }
    }
}















