package afinal.nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;
        public void print() {
            System.out.println(nestedInstanceValue);
//            System.out.println(outInstanceValue); // 바깥 클래스의 인스턴스 밸류 접근 ㄴ
            System.out.println(NestedOuter.outClassValue);
        }
    }
}

