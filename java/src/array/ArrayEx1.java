package amiddle.array;

public class ArrayEx1 {

    public static void main(String[] args) {

        int[] studentScores = {90, 80, 70, 60, 50};
        int total = 0;
        for (int score : studentScores) {
            total += score;
        }
        double average = (double) total / studentScores.length;

        System.out.println("점수 총합: " + total);
        System.out.println("정수 평균: " + average);

    }
}
