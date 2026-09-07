package afinal.nested.nested.ex3;

public class OuterClass4Main {
    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };

        hello.hello();
    }
}
