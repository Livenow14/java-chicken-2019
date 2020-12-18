package domain.discountPolicy;

import domain.order.Orders;

public class AmountDiscount implements DiscountPolicy{
    private static final int DISCOUNT_BUNDLE = 10;
    private static final int DISCOUNT_AMOUNT = 10_000;

    @Override
    public int discount(Orders orders) {
        return 0;
    }
}
