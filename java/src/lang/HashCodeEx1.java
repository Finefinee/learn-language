package lang;

public class HashCodeEx1 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = "Hello";

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s1 == s2);
    }
}
// hashcode는 내용을 기반으로 만들어진다
// object는 아니다