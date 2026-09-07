package amiddle.array;

public class Array1 {

    public static void main(String[] args) {

        int[] students;
        students = new int[5];

        students[0] = 1;
        students[1] = 2;
        students[2] = 3;
        students[3] = 4;
        students[4] = 5;

        for (int i = 0; i < 5; i++) {
            System.out.printf("학생 %d 번호: %d\n", i+1, students[i]);
        }
    }
}
