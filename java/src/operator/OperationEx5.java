package amiddle.operator;

import java.util.Scanner;

public class OperationEx5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.printf("x = %d, %s", input, input % 2 == 0 ? "짝수": "홀수");

    }
}
