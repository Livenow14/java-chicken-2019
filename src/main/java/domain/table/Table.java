package domain.table;

import domain.order.Order;
import domain.order.Orders;

public class Table {
    private final Orders orders = Orders.emptyOrders();
    private final int number;

    public Table(final int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }

    public int getNumber() {
        return number;
    }

    public void addOrder(Order order) {
        orders.addOrder(order);
    }

    public Orders getOrders() {
        return orders;
    }

    public boolean isEmpty() {
        return orders.isEmpty();
    }
}
