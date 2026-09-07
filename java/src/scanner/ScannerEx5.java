package amiddle.scanner;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hap = 0;

        while (true) {

            int inputNumber = scanner.nextInt();
            if (inputNumber == 0) {
                break;
            }

            hap += inputNumber;
        }

        System.out.println(hap);
    }
}
