package amiddle.scanner;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1);
        } else if (number2 > number1) {
            System.out.println(number2);
        } else {
            System.out.println("같다");
        }
    }
}
