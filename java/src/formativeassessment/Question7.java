package amiddle.formativeassessment;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            for (int j = 1; j <= 9; j++) {
                for (int i = number1; i >= number2; i--) {
                    System.out.printf("%d * %d = %2d   ", i, j, i*j);
                }
                System.out.println();
            }
        } else {
            for (int j = 1; j <= 9; j++) {
                for (int i = number1; i <= number2; i++) {
                    System.out.printf("%d * %d = %2d   ", i, j, i*j);
                }
                System.out.println();
            }
        }


    }
}
