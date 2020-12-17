package domain.order;

import domain.Category;
import domain.OrderAmount;
import domain.menu.Menu;
import domain.table.Table;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    @DisplayName("주문 저장 테스트")
    void testSave() {
        //given
        Table table = new Table(1);
        Menu menu = new Menu(1, "매운치킨", Category.CHICKEN, 10000);
        OrderAmount orderAmount = new OrderAmount(10);

        //when
        Order order = new Order(menu, orderAmount);
        table.addOrder(order);
        List<Order> orders = table.getOrders().getOrders();

        //then
        Assertions.assertThat(orders.get(0)).isEqualTo(order);
    }

    @Test
    @DisplayName("동일 메뉴 주문 저장 테스트")
    void testSameMenuSave() {
        //given
        Table table = new Table(1);
        Menu menu = new Menu(1, "매운치킨", Category.CHICKEN, 10000);
        Menu menu2 = new Menu(1, "매운치킨", Category.CHICKEN, 10000);
        OrderAmount orderAmount = new OrderAmount(10);

        //when
        Order order = new Order(menu, orderAmount);
        Order order2 = new Order(menu2, orderAmount);
        table.addOrder(order);
        table.addOrder(order2);
        List<Order> orders = table.getOrders().getOrders();

        //then
        Assertions.assertThat(orders.get(0)).isEqualTo(order);
        Assertions.assertThat(orders.get(0).getOrderAmount().getAmount()).isEqualTo(20);
    }
}