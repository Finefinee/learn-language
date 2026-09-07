package afinal.trycatchfinally.ex1;

public class UserExceptionExample {
    public static void main(String[] args) {
        A a = new A();
        try {
            a.checkScore(85);
            a.checkScore(150);
        } catch (MinusException | OverException exception) {
            exception.printStackTrace();
        }
    }
}
