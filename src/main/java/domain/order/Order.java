package domain.order;

import domain.OrderAmount;
import domain.menu.Menu;

public class Order {
    private final Menu menu;
    private final OrderAmount orderAmount;

    public Order(Menu menu, OrderAmount orderAmount) {
        this.menu = menu;
        this.orderAmount = orderAmount;
    }
}
