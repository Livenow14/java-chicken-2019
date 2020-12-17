package domain.order;

import domain.OrderAmount;

import java.util.ArrayList;
import java.util.List;

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
        checkAmount(order);

        if (isSameMenu(order)) {
            addAmount(order);
            return;
        }
        orders.add(order);
    }

    private void addAmount(Order order) {
        orders.stream()
                .forEach(order1 -> {
                    if (order1.equals(order)) {
                        order1.addAmount(order);
                    }
                });
    }

    private void checkAmount(Order order) {
        int preAmount = orders.stream()
                .map(Order::getOrderAmount)
                .mapToInt(OrderAmount::getAmount)
                .sum();
        order.checkMaxSize(preAmount);
    }

    private boolean isSameMenu(Order order) {
        boolean isSameMenu = orders.stream()
                .filter(o -> o.equals(order))
                .findAny().isPresent();
        return isSameMenu;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
