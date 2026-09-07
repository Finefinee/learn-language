package amiddle.edu;

public class Student {
    private String name;
    private int age;
    private School school;

//    public Student(String name, int age, School school) {
    public Student(String name, int age, String schoolName, String address) {
        this.name = name;
        this.age = age;
//        this.school = school;
        this.school = new School(schoolName, address);
    }

    public void printInfo() {
        System.out.println("학생 이름: " + name);
        System.out.println("학생 나이: " + age);
        this.school.printInfo();
    }
}

class School {
    private String schoolName;
    private String address;

    public School(String schoolName, String address) {
        this.schoolName = schoolName;
        this.address = address;
    }

    public void printInfo() {
        System.out.println("학교 이름: " + schoolName);
        System.out.println("학교 주소: " + address);
    }
}
