package domain;

public class OrderAmount {
    private static final int MIN_AMOUNT = 0;
    private static final int MAX_AMOUNT = 99;
    private final int amount;

    public OrderAmount(int amount) {
        this.amount = amount;
        validateAmount();
    }

    public void validateAmount() {
        if (amount < MIN_AMOUNT || amount > MAX_AMOUNT) {
            throw new IllegalArgumentException("수량은 0보다 크고 100보다 작아야 합니다.");
        }
    }

    public int getAmount() {
        return amount;
    }

    public OrderAmount plus(OrderAmount orderAmount) {
        checkMaxSize(orderAmount.amount);
        return new OrderAmount(this.amount + orderAmount.amount);
    }

    public void checkMaxSize(int preAmount) {
        if (this.amount + preAmount > MAX_AMOUNT) {
            throw new IllegalArgumentException(String.format("현재수량은 %d인데 %d를 더하면 최대 수량을 넘습니다.", preAmount, this.amount));
        }
    }
}
