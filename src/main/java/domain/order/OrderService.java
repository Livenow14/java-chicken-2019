package domain.order;

import domain.OrderAmount;
import domain.menu.Menu;
import domain.menu.MenuRepository;
import domain.table.Table;
import domain.table.TableRepository;
import view.InputView;
import view.OutputView;

import java.util.List;

public class OrderService {
    private final List<Menu> menus;
    private final List<Table> tables;

    private OrderService(List<Menu> menus, List<Table> tables) {
        this.menus = menus;
        this.tables = tables;
    }

    public static OrderService init() {
        return new OrderService(MenuRepository.menus(), TableRepository.tables());
    }

    public void createOrder() {
        OutputView.printTables(tables);
        int tableNumber = InputView.inputTableNumber();
        Table table = TableRepository.findById(tableNumber);

        OutputView.printMenus(menus);
        int menuNumber = InputView.inputMenu();
        Menu menu = MenuRepository.findById(menuNumber);

        int amount = InputView.inputAmount();
        OrderAmount orderAmount = new OrderAmount(amount);
        Order order = new Order(menu, orderAmount);

        table.addOrder(order);
    }
}
