package amiddle.process;

import java.util.Scanner;

class MathFeature1 {
    int num1;
    int num2;
    public MathFeature1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력: ");
        num1 = sc.nextInt();
        System.out.print("두번째 숫자 입력: ");
        num2 = sc.nextInt();
    }
    void add() {
        System.out.println("=====덧셈=====");
        int i = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + i);
    }

    void sum() {
        System.out.println("=====뺄셈=====");
        int i = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + i);
    }

    void mul() {
        System.out.println("=====곱셈=====");
        int i = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + i);
    }

    void div() {
        System.out.println("=====나눗셈=====");
        try {
            int i = num1 / num2;
            double j = num1 % num2;
            System.out.println(num1 + " / " + num2 + " = " + i);
            System.out.println("나머지: " + j);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("0으로 나눌 수는 없습니다!");
        }
    }
}

public class MathFeature {
    public static void main(String[] args) {
        MathFeature1 math = new MathFeature1();
        math.add();
        math.sum();
        math.mul();
        math.div();
    }
}