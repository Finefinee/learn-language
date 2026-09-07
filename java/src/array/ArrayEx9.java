package amiddle.array;

public class ArrayEx9 {

    public static void main(String[] args) {

//        학생 1: 85 70 90 95 | 평균: 85.0
//        학생 2: 80 95 90 75 | 평균: 85.0
//        학생 3: 75 85 90 80 | 평균: 82.5

        int[][] students = {
                {85, 70, 90, 95},
                {80, 95, 90, 75},
                {75, 85, 90, 80}
        };

        for (int i = 0; i < students.length; i++) {
            double average = (double) (students[i][0] + students[i][1] + students[i][2] + students[i][3]) / 4;
            System.out.printf("학생 %d: %d %d %d %d | 평균: %.1f\n", i + 1, students[i][0], students[i][1], students[i][2], students[i][3], average);
        }
    }
}
