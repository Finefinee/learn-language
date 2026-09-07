package amiddle.array;

public class ArrayRefactoring1 {

    public static void main(String[] args) {

        int[] students;
        students = new int[5];
        students[0] = 1;
        students[1] = 2;
        students[2] = 3;
        students[3] = 4;
        students[4] = 5;

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 번호: " + students[i]);

        }
    }
}
