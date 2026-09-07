package amiddle.classs;

public class Student {

    String name;
    int studentId;
    int grade;

    public Student(String name, int studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    public void introduce() {
        System.out.printf("저는 %d학년 %d %s입니다.", this.grade, this.studentId, this.name);
    }
}
