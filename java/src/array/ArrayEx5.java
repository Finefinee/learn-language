package amiddle.array;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hap = 0;
        double average = 0;
        int arraySize = scanner.nextInt();

        int[] arr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            int number = scanner.nextInt();
            arr[i] = number;
        }

        for (int i = 0; i < arraySize; i++) {
            hap += arr[i];
        }

        average = (double) hap / arraySize;

        System.out.println("합계: " + hap);
        System.out.println("평균: " + average);

    }
}
