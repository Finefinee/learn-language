package amiddle.classs;

public class Student0 {

    public Student0() {
    }

    public Student0(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    private String name;
    private int age;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void showData() {
        System.out.printf("이름: %s, 나이: %d, 성적: %d", this.name, this.age, this.grade);
    }
}
