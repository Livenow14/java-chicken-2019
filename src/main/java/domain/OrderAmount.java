package domain;

public class OrderAmount {
    private static final int MIN_AMOUNT = 0;
    private static final int MAX_AMOUNT = 99;
    private final int quantity;

    public OrderAmount(int quantity) {
        this.quantity = quantity;
        validateAmount();
    }

    public void validateAmount() {
        if (quantity < MIN_AMOUNT || quantity > MAX_AMOUNT) {
            throw new IllegalArgumentException("수량은 0보다 크고 100보다 작아야 합니다.");
        }
    }
}
