package amiddle.scanner;

import java.util.Scanner;

public class ScannerEx8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            printNumbers(num1, num2);
        } else if (num1 > num2) {
            printNumbers(num2, num1);
        }
    }

    private static void printNumbers(int SmallerNumber, int biggerNumber) {
        for (int i = SmallerNumber + 1; i < biggerNumber; i++) {
            System.out.print(i);

            if ((i + 1) == biggerNumber) {
                continue;
            }
            System.out.print(", ");
        }
    }
}
