package amiddle.scanner;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                break;
            }
            System.out.println(str);
        }
    }
}
