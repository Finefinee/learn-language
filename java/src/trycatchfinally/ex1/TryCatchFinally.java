package afinal.trycatchfinally.ex1;

public class TryCatchFinally {

    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
            System.out.println("프로그램 종료");

        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.println("프로그램 종료");
        }

    }
}
