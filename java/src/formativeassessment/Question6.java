package amiddle.formativeassessment;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        for (int i = 1; i <= number1; i++) {
            for (int j = i; j < number2 + i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}
