package domain;

public class OrderQuantity {
    private final int quantity;

    private OrderQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static OrderQuantity of(int quantity) {
        return new OrderQuantity(quantity);
    }
}
