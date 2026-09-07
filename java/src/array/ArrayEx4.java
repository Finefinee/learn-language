package amiddle.array;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hap = 0;
        double average = 0;

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            arr[i] = number;
        }

        for (int i = 0; i < 5; i++) {
            hap += arr[i];
        }

        average = (double) hap / 5;

        System.out.println("합계: " + hap);
        System.out.println("평균: " + average);

    }
}
