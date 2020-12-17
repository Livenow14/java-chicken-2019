package view;

import domain.menu.Menu;
import domain.order.Order;
import domain.order.Orders;
import domain.table.Table;

import java.util.List;

public class OutputView {
    private static final String TOP_LINE = "┌ ─ ┐";
    private static final String TABLE_FORMAT = "| %s |";
    private static final String BOTTOM_LINE = "└ %s ┘";
    private static final String ORDERED = "$";
    private static final String NOT_ORDERED = "-";

    public static void printTables(final List<Table> tables) {
        System.out.println("## 테이블 목록");
        final int size = tables.size();
        printLine(TOP_LINE, size);
        printTableNumbers(tables);
        printBottom(tables, BOTTOM_LINE, size);
    }

    private static void printBottom(List<Table> tables, String line, final int count) {
        for (int index = 0; index < count; index++) {
            if (isOrdered(tables.get(index))) {
                System.out.printf(line, ORDERED);
                continue;
            }
            System.out.printf(line, NOT_ORDERED);
        }
        System.out.println();
    }

    private static boolean isOrdered(Table table) {
        if (table.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void printMenus(final List<Menu> menus) {
        for (final Menu menu : menus) {
            System.out.println(menu);
        }
    }

    public static void printSharp(final String name) {
        System.out.println();
        System.out.println(Prefix.SHARP.getPrefix() + name);
    }

    public static void println(final String name) {
        System.out.println(name);
    }

    private static void printLine(final String line, final int count) {
        for (int index = 0; index < count; index++) {
            System.out.print(line);
        }
        System.out.println();
    }

    private static void printTableNumbers(final List<Table> tables) {
        for (final Table table : tables) {
            System.out.printf(TABLE_FORMAT, table);
        }
        System.out.println();
    }

    public static void printEnter() {
        System.out.println();
    }

    public static void printOrderHistory(Orders orders, int tableNumber) {
        printSharp("주문 내역");
        System.out.println("메뉴 수량 금액");
        List<Order> orderList = orders.getOrders();
        orderList.forEach( order -> {
            System.out.println(order.getMenu().getName() + " " + order.getOrderAmount().getAmount() + " " +  order.getTotalPrice()) ;
        });
        printSharp(tableNumber + "번 테이블의 결제를 진행합니다");
    }
}
