package amiddle.formativeassessment;

import java.util.Scanner;

public class Question5_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
