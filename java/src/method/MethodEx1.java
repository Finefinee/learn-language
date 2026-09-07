package amiddle.method;

public class MethodEx1 {

    public static void main(String[] args) {
        int sum = add(1, 2, 3);
        double average = avg(sum, 3);
        System.out.println("평균: " + average);

        sum = add(15, 25, 35);
        average = avg(sum, 3);
        System.out.println("평균: " + average);
    }

    public static int add(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

    public static double avg(int a, int b) {
        return (double) a / b;
    }
}
