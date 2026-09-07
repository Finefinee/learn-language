package amiddle.array;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            arr[i] = number;
        }

        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i == 0) {
                continue;
            }
            System.out.print(", ");
        }
    }
}
