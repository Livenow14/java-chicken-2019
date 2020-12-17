package domain.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Orders {
    private final List<Order> orders;

    private Orders(List<Order> orders) {
        this.orders = new ArrayList<>(orders);
    }

    public static Orders of(List<Order> orders) {
        return new Orders(orders);
    }

    public static Orders emptyOrders() {
        return new Orders(new ArrayList<>());
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders1 = (Orders) o;
        return Objects.equals(orders, orders1.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }
}
