package amiddle.loop;

public class LoopEx12 {

    public static void main(String[] args) {

        String[] s = new String[]{"A", "B", "C", "D", "E", "0", "F", "1", "2"};

        for (int i = 0; i < 3; i++) {
            System.out.printf("%s %s %s\n", s[i*3], s[i*3+1], s[i*3+2]);
        }
    }
}
