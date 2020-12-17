package domain.order;

import domain.OrderAmount;
import domain.menu.Menu;

import java.util.Objects;

public class Order {
    private final Menu menu;
    private OrderAmount orderAmount;

    public Order(Menu menu, OrderAmount orderAmount) {
        this.menu = menu;
        this.orderAmount = orderAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(menu, order.menu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menu, orderAmount);
    }

    public void addAmount(Order order) {
        orderAmount = orderAmount.plus(order.orderAmount);
    }

    public OrderAmount getOrderAmount() {
        return orderAmount;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getTotalPrice() {
        return menu.getPrice() * orderAmount.getAmount();
    }

    public void checkMaxSize(int preAmount) {
        orderAmount.checkMaxSize(preAmount);
    }
}
