package amiddle.memory.ex;

public class StaticEx2 {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        int sum = MathArrayUtils.sum(values);
        double average = MathArrayUtils.average(values);
        int min = MathArrayUtils.min(values);
        int max = MathArrayUtils.max(values);

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
