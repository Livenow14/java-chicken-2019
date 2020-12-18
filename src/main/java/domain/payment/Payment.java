package domain.payment;

import domain.discountPolicy.DiscountPolicy;
import domain.order.Orders;

import java.util.List;

public class Payment {
    private final Orders orders;
    private List<DiscountPolicy> discountPolicies;

    public Payment(Orders orders, List<DiscountPolicy> discountPolicies) {
        this.orders = orders;
        this.discountPolicies = discountPolicies;
    }

    public void getPrice() {
        int totalPrice = orders.getTotalPrice();
        int chickenAmount = orders.getChickenAmount();
    }
}
