package amiddle.loop;

public class LoopEx11 {

    public static void main(String[] args) {

        for (int i = 4; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}
