package amiddle.memory.ex;

public class Car {

    private static int totalCar = 0;

    private String name;

    public Car(String name) {
        this.name = name;

        totalCar += 1;

        System.out.println("차량 구입, 이름: " + name);
    }

    public static void showTotalCars() {
        System.out.println("구매 차량 수 = " + totalCar);
    }
}
