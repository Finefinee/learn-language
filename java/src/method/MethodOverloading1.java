package amiddle.method;

public class MethodOverloading1 {

    public static void main(String[] args) {

        System.out.println("1: " + add(1, 2));
        System.out.println("1: " + add(1, 2, 3));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }

    public static int add(int... args) {
        int count = 0;
        for (int arg : args) {
            count += arg;
        }
        return count;
    }
}
