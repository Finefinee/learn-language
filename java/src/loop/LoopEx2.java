package amiddle.loop;

import java.util.Scanner;

public class LoopEx2 {

//    입력받은 자연수부터 5개의 숫자를 출력하는 프로그램을 작성하시오.
//
//    count 변수를 사용하고 while문, for문
//2가지 버전의 정답을 작성해야함.
//
//    클래스 이름은 `LoopEx2` 라고 적어주세요.
//
//            5
//            5
//            6
//            7
//            8
//            9

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int inputNumber = sc.nextInt();

        while (count != 5) {
            System.out.println(inputNumber++);
            count++;
        }

        inputNumber = sc.nextInt();

        for (count = 0; count != 5; count++) {
            System.out.println(inputNumber++);
        }

    }
}
