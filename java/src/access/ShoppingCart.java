package amiddle.access;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount == 10) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.printf("상품명: %s, 합계: %d", item.getName(), item.getTotalPrice());
        }
    }
}
