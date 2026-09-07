package amiddle.loop;

import java.util.Scanner;

public class LoopEx5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();

        for (int i = 1; i <= inputNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
