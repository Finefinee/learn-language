package exceptionex;

public class ThrowEx1 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception();
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// Exception 자식은 반드시 예외처리