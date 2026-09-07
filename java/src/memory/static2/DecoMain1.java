package amiddle.memory.static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello";
        DecoUtil1 decoUtil1 = new DecoUtil1(); // static으로 바꾸면 이거 할 필요 없음

        String deco = decoUtil1.deco(s);
        System.out.println(deco);
    }
}
