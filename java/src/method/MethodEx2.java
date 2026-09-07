package amiddle.method;

public class MethodEx2 {

    public static void main(String[] args) {

        String message = "Hello, World!";
        printMessage(message, 3);
        printMessage(message, 5);
        printMessage(message, 7);

    }

    public static void printMessage(String message, int length) {
        for (int i = 0; i < length; i++) {
            System.out.println(message);
        }
    }
}
