package amiddle.loop;

import java.util.Scanner;

public class LoopEx4 {

    public static void main(String[] args) {

//        1부터 입력받은 숫자까지 합계를
//        계산하는 프로그램을 작성하시오.
//                while문, for문 2가지 버전의 정답을 작성해야함.
//        클래스 이름은 `LoopEx4` 라고 적어주세요.
//
//        10
//        1 3 6 10 15 21 28 36 45 55

        Scanner sc = new Scanner(System.in);

        int hap = 0;
        int count = 0;
        int inputNumber = sc.nextInt();

        while (count != inputNumber) {
            count++;
            hap += count;
            System.out.println(hap);
        }

        hap = 0;
        inputNumber = sc.nextInt();
        for (count = 1; count != inputNumber + 1; count++) {
            hap += count;
            System.out.println(hap);
        }
    }
}
