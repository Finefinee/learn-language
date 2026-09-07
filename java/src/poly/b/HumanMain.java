package amiddle.poly.b;

public class HumanMain {

    public static void main(String[] args) {

        Human human1 = new Human("0000000-0000000");
        Human human2 = new Student("111111-1111111", "2020202");

        Human[] humans = {human1, human2};
        for (Human human : humans) {
            System.out.println("주민번호: " + human.getResidentId());
            if (human instanceof Student) {
                Student student = (Student) human;
                System.out.println("학생 주민번호: " + student.getResidentId());
                System.out.println("학생 학번: " + student.getStudentId());
                student.study();

            } else {
                System.out.println("사람 주민번호: " + human.getResidentId());
                human.speak();
            }
            System.out.println();
        }
    }
}
