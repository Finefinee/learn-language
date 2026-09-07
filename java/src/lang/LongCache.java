package lang;

public class LongCache {
    public static void main(String[] args) {
        Long a = 127L;
        Long b = 127L;
        System.out.println(a == b); // true

        Long c = 128L;
        Long d = 128L;
        System.out.println(c == d); // false
    }
}
