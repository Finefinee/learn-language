package amiddle.classs;

public class Class5 {
    public static void main(String[] args) {
        Student0[] student0s = new Student0[]{
                new Student0("학생1", 15, 90),
                new Student0("학생2", 16, 80)
        };

        for (Student0 student0 : student0s) {
            student0.showData();
        }
    }
}
