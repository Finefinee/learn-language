package amiddle.loop;

import java.util.Scanner;

public class LoopEx3 {

//    입력받은 자연수부터 5개의 짝수를
//    출력하는 프로그램을 작성하시오
//    홀수 입력시 입력된 숫자+1부터 출력한다.
//    while문, for문 2가지 버전의 정답을 작성해야함.
//    클래스 이름은 `LoopEx3` 라고 적어주세요.
//
//            5
//            6 8 10 12 14

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int inputNumber = sc.nextInt();

        while (count != 10) {
            inputNumber++;
            if (inputNumber % 2 == 0) {
                System.out.println(inputNumber);
            }
            count++;
        }

        inputNumber = sc.nextInt();

        for (count = 0; count != 10; count++) {
            inputNumber++;
            if (inputNumber % 2 == 0) {
                System.out.println(inputNumber);
            }
        }
    }
}
