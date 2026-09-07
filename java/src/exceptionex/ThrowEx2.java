package exceptionex;

public class ThrowEx2 {
    public static void main(String[] args) {

        String hello = null;
        System.out.println(hello.toLowerCase());

        throw new RuntimeException();

    }
}
// RuntimeException 자식은 catch 안 해도 됨