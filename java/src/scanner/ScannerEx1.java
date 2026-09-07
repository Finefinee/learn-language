package amiddle.scanner;

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hap = 0;

        for (int i = 0; i < 3; i++) {
            int number = scanner.nextInt();
            hap += number;
        }

        System.out.println((float) hap/3);

    }
}
