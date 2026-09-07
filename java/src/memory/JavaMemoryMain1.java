package amiddle.memory;

public class JavaMemoryMain1 {

    public static void main(String[] args) {

        System.out.println("메인 시작");
        method1(10);
        System.out.println("메인 끝");
    }

    static void method1(int m1) {
        System.out.println("method1 시작");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 끝");
    }

    static void method2(int m2) {
        System.out.println("method2 시작");
        System.out.println("method2 끝");
    }
}
