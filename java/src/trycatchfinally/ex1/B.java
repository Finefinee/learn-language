package afinal.trycatchfinally.ex1;

public class B {
    void abc() {
        try {
            bcd();
        } catch (InterruptedException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    void bcd() throws InterruptedException, ClassNotFoundException {
        Class cls = Class.forName("java.lang.Object");
        Thread.sleep(1000);
    }
}
