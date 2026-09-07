package amiddle.variable;

// 작은 자료형에 하면 손실이 일어나므로 개발자가 수동으로 해야 함.
public class TypeCasting4 {

    public static void main(String[] args) {

        byte value6 = (byte) 128;
        int value7 = (int) 3.5;
        float value8 = (float) 7.5;

        System.out.println(value6);
        System.out.println(value7);
        System.out.println(value8);
    }
}
