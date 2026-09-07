package amiddle.memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {

        System.out.println("메인 시작");
        method1();
        System.out.println("메인 끝");
    }

    static void method1() {
        System.out.println("method1 시작");
        Data1 data1 = new Data1(10);
        method2(data1);
        System.out.println("method1 끝");
    }

    static void method2(Data1 data1) {
        System.out.println("method2 시작");
        System.out.println("data.value = " + data1.getValue());
        System.out.println("method2 끝");
    }
}
