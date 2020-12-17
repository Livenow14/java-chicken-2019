package domain.discountPolicy;

import domain.payment.Payment;

public interface DiscountPolicy {
    int discount(Payment payment);
}
