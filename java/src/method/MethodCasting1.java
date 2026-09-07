package amiddle.method;

public class MethodCasting1 {

    public static void main(String[] args) {

        double number = 1.5;
        printNumber(number);
        printNumber((int) number);
    }

    public static void printNumber(int n) {
        System.out.println("숫자 (int): " + n);
    }

    public static void printNumber(double d) {
        System.out.println("숫자 (double): " + d);
    }
}
