package amiddle.array;

import java.util.Scanner;

public class ArrayEx10 {

    public static void main(String[] args) {

//        기능 예시
//        1. 상품 등록: 상품 이름과 가격을 입력받아 저장한다.
//        2. 상품 목록: 지금까지 등록한 모든 상품의 목록을 출력한다.
//        동작 예시
//        1. 첫 화면에서 사용자에게 세 가지 선택을 제시한다: "1. 상품 등록", "2. 상품 목록", "3. 종료"
//        2. "1. 상품 등록"을 선택하면, 사용자로부터 상품 이름과 가격을 입력받아 배열에 저장한다.
//        3. "2. 상품 목록"을 선택하면, 배열에 저장된 모든 상품을 출력한다.
//        4. "3. 종료"를 선택하면 프로그램을 종료한다.
//        제약 조건 : 상품은 최대 10개까지 등록할 수 있다.

        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[10];
        int count = 0;

        while (true) {
            System.out.println("1. 상품 등록, 2. 상품 목록, 3. 종료");
            int option = scanner.nextInt();
            String clear = scanner.nextLine();
            if (option == 1) {
                System.out.println("상품 이름, 가격 입력 (enter 구분)");
                String productName = scanner.nextLine();
                int productPrice = scanner.nextInt();
                Product product = new Product(productName, productPrice);
                products[count] = product;
                count++;
            } else if (option == 2) {
                for (int i = 0; i < count; i++) {
                    System.out.printf("%s: %d원\n", products[i].name, products[i].price);
                }
            } else {
                break;
            }

        }

    }

    public static class Product {
        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }
}
