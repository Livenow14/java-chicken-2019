package domain.discountPolicy;

import domain.order.Orders;

public class NoneDiscount implements DiscountPolicy {
    @Override
    public int discount(Orders orders) {
        return 0;
    }
}
