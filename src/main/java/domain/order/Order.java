package domain.order;

import domain.OrderQuantity;
import domain.menu.Menu;
import domain.table.Table;

public class Order {
    private final Table table;
    private final Menu menu;
    private final OrderQuantity orderQuantity;

    public Order(Table table, Menu menu, OrderQuantity orderQuantity) {
        this.table = table;
        this.menu = menu;
        this.orderQuantity = orderQuantity;
    }



}
