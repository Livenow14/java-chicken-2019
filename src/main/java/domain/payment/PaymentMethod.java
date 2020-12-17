package domain.payment;

public enum PaymentMethod {
    CARD(1),
    CASH(2);

    private int option;

    PaymentMethod(int option) {
        this.option = option;
    }

    public int getOption() {
        return option;
    }
}
