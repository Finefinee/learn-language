package amiddle.scanner;

import java.util.Scanner;

public class ScannerEx9 {

    public static void main(String[] args) {
//
//        1. 사용자로부터 상품 정보(상품명, 가격, 수량)를 입력받고, 이들의 총 가격을 출력하는 프로그램을 작성하세        요.
//        2. 사용자는 여러 상품을 추가하고 결제할 수 있으며, 프로그램을 언제든지 종료할 수 있습니다.
//        3. 사용자에게 다음 세 가지 옵션을 제공해야 합니다: 1: 상품 입력, 2: 결제, 3: 프로그램 종료. 옵션은 정수로
//        입력받으며, 옵션을 저장하는 변수의 이름은 `option` 이어야 합니다.
//        4. 상품 입력 옵션을 선택하면, 사용자에게 상품명과 가격, 수량을 입력받으세요.
//        5. 결제 옵션을 선택하면, 총 비용을 출력하고 총 비용을 `0` 으로 초기화하세요. (사용자가 총 비용을 확인하
//        고, 결제를 완료했다고 가정합니다. 따라서 다음 사용자를 위해 총 비용을 다시 `0` 으로 초기화 해야합니
//        다.)

        Scanner scanner = new Scanner(System.in);
        int option;
        int totalPrice = 0;

        while (true) {
            System.out.print("옵션 입력 (1, 2, 3): ");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.print("상품명 입력: ");
                String productName = scanner.nextLine();
                System.out.print("상품명 가격: ");
                int productPrice = scanner.nextInt();
                System.out.print("상품명 수량: ");
                int productAmount = scanner.nextInt();
                totalPrice += productPrice * productAmount;
            } else if (option == 2) {
                System.out.println(totalPrice + "원 결제 완료");
                totalPrice = 0;
            } else if (option == 3) {
                break;
            }
        }
    }
}
