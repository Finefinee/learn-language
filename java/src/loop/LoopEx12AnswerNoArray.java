package amiddle.loop;

public class    LoopEx12AnswerNoArray {

    public static void main(String[] args) {

        char alp = 'A';
        int num = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3-i; j++) {
                System.out.print(alp++ + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
