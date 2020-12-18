package domain.order;

import domain.Category;
import domain.OrderAmount;
import domain.menu.Menu;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OrdersTest {

    @Test
    @DisplayName("주문 총가격이 일치해야한다.")
    void testOrderPrice() {
        //given
        Menu menu1 = new Menu(1, "후라이드", Category.CHICKEN, 16_000);
        Menu menu2 = new Menu(3, "간장치킨", Category.CHICKEN, 20_000);
        OrderAmount orderAmount = new OrderAmount(10);
        OrderAmount orderAmount2 = new OrderAmount(5);

        //when
        Order order = new Order(menu1, orderAmount);
        Order order2 = new Order(menu2, orderAmount2);
        Orders target = Orders.of(Arrays.asList(order, order2));

        //then
        Assertions.assertThat(target.getTotalPrice()).isEqualTo(260_000);
    }

    @Test
    @DisplayName("치킨 주문 수량이 일치해야한다.")
    void testOrderChickenAmount() {
        //given
        Menu menu1 = new Menu(1, "후라이드", Category.CHICKEN, 16_000);
        Menu menu2 = new Menu(3, "코올라", Category.BEVERAGE, 2_000);
        OrderAmount orderAmount = new OrderAmount(10);
        OrderAmount orderAmount2 = new OrderAmount(5);

        //when
        Order order = new Order(menu1, orderAmount);
        Order order2 = new Order(menu2, orderAmount2);
        Orders target = Orders.of(Arrays.asList(order, order2));

        //then
        Assertions.assertThat(target.getChickenAmount()).isEqualTo(10);
    }
}