package amiddle.classs;

public class ClassEx4 {


    public static class ProductOrder {

        private String name;
        private int price;
        private int quantity;

        public ProductOrder(String name, int price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void showProductOrder() {
            System.out.println("상품명: " + this.name + ", 가격: " + this.price + ", 수량: " + this.quantity);
        }
    }

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[]{
                new ProductOrder("두부", 2000, 2),
                new ProductOrder("김치", 5000, 1),
                new ProductOrder("콜", 1500, 2)
        };
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            order.showProductOrder();
            totalAmount += order.getPrice() * order.getQuantity();
        }
        System.out.println("총 결제 금액: " + totalAmount);

    }
}
