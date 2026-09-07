package afinal.nested;

public class ShadowingMain {
    public int value = 1;
    class Inner {
        public int value = 2;
        void go() {
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();

    }
}
