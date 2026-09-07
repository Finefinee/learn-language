package amiddle.formativeassessment;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. 삽입");
        System.out.println("2. 수정");
        System.out.println("3. 삭제");
        System.out.println("숫자를 선택하세요.");

        int option = scanner.nextInt();
        switch (option) {
            case 1 -> System.out.println("삽입을 선택했습니다.");
            case 2 -> System.out.println("수정을 선택했습니다.");
            case 3 -> System.out.println("삭제를 선택했습니다.");
            default -> System.out.println("선택지에 없는 숫자를 선택했습니다.");
        }
    }
}
