package amiddle.formativeassessment;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println(number1 > number2 ? number1 : number2);
    }
}
