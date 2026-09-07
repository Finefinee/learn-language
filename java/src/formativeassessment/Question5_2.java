package amiddle.formativeassessment;

import java.util.Scanner;

public class Question5_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hap = 0;
        int count = 0;

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            int temp = number2;
            number2 = number1;
            number1 = temp;
        }

        for (int i = number1; i <= number2; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                hap += i;
                count++;
            }
        }

        System.out.printf("sum : %d\n", hap);
        System.out.printf("avg : %.1f\n", (float) hap / count);


    }
}
