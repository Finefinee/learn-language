package amiddle.formativeassessment;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int output = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(output);
                output += 2;
                output %= 10;
            }
            System.out.println();
        }
    }
}
