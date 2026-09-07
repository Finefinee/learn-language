package afinal.nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        afinal.nested.inner.InnerOuter outer = new afinal.nested.inner.InnerOuter();
        afinal.nested.inner.InnerOuter.Inner inner = outer.new Inner();
        inner.print();
        System.out.println("innerClass = " + inner.getClass());
    }
}
