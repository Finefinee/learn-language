package amiddle.classs;

public class Class1 {

    public static void main(String[] args) {

        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {80, 90};
        for (int i = 0; i < studentNames.length; i++) {
            System.out.printf("이름: %s, 나이: %d, 성적: %d", studentNames[i], studentAges[i], studentGrades[i]);
        }
    }
}
