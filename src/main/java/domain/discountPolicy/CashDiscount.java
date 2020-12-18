package domain.discountPolicy;

import domain.order.Orders;

public class CashDiscount implements DiscountPolicy{
    private static final double DISCOUNT_RATE = 0.95;

    @Override
    public int discount(Orders orders) {
        return 0;
    }
}
