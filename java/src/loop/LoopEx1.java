package amiddle.loop;

public class LoopEx1 {

//    1부터 하나씩 증가하는 수를
//
//3번 더하는 프로그램을 작성하시오.
//    while문, for문 2가지 버전의 정답을 작성해야함.
//    클래스 이름은 `LoopEx1` 라고 적어주세요.
//
//    while문
//            i=1 sum=1
//    i=2 sum=3
//    i=3 sum=6
//    실행결과
//
//            for문
//    i=1 sum=1
//    i=2 sum=3
//    i=3 sum=6

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 3) {
            sum += i;
            System.out.printf("i=%d, sum=%d\n", i, sum);
            i++;
        }

        sum = 0;

        for (i = 1; i <= 3 ; i++) {
            sum += i;
            System.out.printf("i=%d, sum=%d\n", i, sum);
        }

    }
}
