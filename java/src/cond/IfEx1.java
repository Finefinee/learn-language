package amiddle.cond;

import java.util.Scanner;

public class IfEx1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("아이템 가격과 나이를 입력하세요.");
        int item = sc.nextInt();
        int age = sc.nextInt();
        int total = item;

        if (item >= 10000) {
            total -= 1000;
        }

        if (age <= 10) {
            total -= 1000;
        }

        System.out.println(total);

    }
}
