package amiddle.array;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        int small = array[0];
        int big = array[0];
        for (int i = 1; i < arraySize; i++) {
            if (array[i] < small) {
                small = array[i];
            }
            if (array[i] > big) {
                big = array[i];
            }
        }

        System.out.println("가장 작은 수: " + small);
        System.out.println("가장 큰 수: " + big);
    }
}
