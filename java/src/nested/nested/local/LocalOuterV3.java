package afinal.nested.nested.local;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public LocalOuterV2.Printer process(int paramVar) {
        int localVar = 1;
        class LocalPrinter implements LocalOuterV2.Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        LocalOuterV2.Printer printer = new LocalPrinter();
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        LocalOuterV2.Printer printer = localOuter.process(2);
        printer.print();
    }
}
