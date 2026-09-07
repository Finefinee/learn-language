package amiddle.classs;

public class Class3 {

    public static void main(String[] args) {
        Student0 student01 = new Student0();
        student01.setName("학생1");
        student01.setAge(15);
        student01.setGrade(90);
        Student0 student02 = new Student0();
        student02.setName("학생2");
        student02.setAge(16);
        student02.setGrade(80);
        Student0[] student0s = new Student0[2];
        student0s[0] = student01;
        student0s[1] = student02;
        for (Student0 student0 : student0s) {
            System.out.printf("이름: %s, 나이: %d, 성적: %d", student0.getName(), student0.getAge(), student0.getGrade());
        }
    }
}
