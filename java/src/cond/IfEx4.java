package amiddle.cond;

import java.util.Scanner;

public class IfEx4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dollar = sc.nextInt();

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if ( dollar == 0 ) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            double won = 1473.48 * dollar;
            System.out.printf("환전 금액은 %.1f원입니다.", won);
        }
    }
}
