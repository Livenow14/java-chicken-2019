package domain.discountPolicy;

import domain.order.Orders;

public interface DiscountPolicy {
    int discount(Orders orders);
}
