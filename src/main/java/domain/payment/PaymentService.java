package domain.payment;

import domain.discountPolicy.AmountDiscount;
import domain.discountPolicy.CashDiscount;
import domain.discountPolicy.DiscountPolicy;
import domain.discountPolicy.NoneDiscount;
import domain.menu.Menu;
import domain.menu.MenuRepository;
import domain.order.Orders;
import domain.table.Table;
import domain.table.TableRepository;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PaymentService {
    private final List<Menu> menus;
    private final List<Table> tables;

    private PaymentService(List<Menu> menus, List<Table> tables) {
        this.menus = menus;
        this.tables = tables;
    }

    public static PaymentService init() {
        return new PaymentService(MenuRepository.menus(), TableRepository.tables());
    }

    public void pay() {
        OutputView.printTables(tables);
        int tableNumber = InputView.inputTableNumber();
        Table table = TableRepository.findById(tableNumber);
        if (table.isEmpty()) {
            throw new NoSuchElementException(tableNumber + "는 주문되지 않은 테이블 번호입니다.");
        }
        Orders orders = table.getOrders();

        OutputView.printOrderHistory(orders, tableNumber);
        choosePaymentMethod(orders);
    }

    private void choosePaymentMethod(Orders orders) {
        int payMethod = InputView.inputPayMethod();
        List<DiscountPolicy> discountPolicies = new ArrayList<>();
        discountPolicies.add(new AmountDiscount());
        if (payMethod == PaymentMethod.CASH.getOption()) {
            discountPolicies.add(new CashDiscount());
        }
        Payment payment = new Payment(orders, discountPolicies);
        payment.getPrice();
    }
}
