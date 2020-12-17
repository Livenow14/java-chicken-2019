package domain.payment;

import domain.discountPolicy.DiscountPolicy;
import domain.order.Orders;

public class Payment {
    private final Orders orders;
    private final DiscountPolicy discountPolicy;

    public Payment(Orders orders, DiscountPolicy discountPolicy) {
        this.orders = orders;
        this.discountPolicy = discountPolicy;
    }
}
