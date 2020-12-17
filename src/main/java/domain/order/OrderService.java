package domain.order;

import domain.menu.Menu;
import domain.menu.MenuRepository;
import domain.table.Table;
import domain.table.TableRepository;
import exception.ErrorCode;
import exception.MenuException;
import exception.TableException;
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

        int quantity = InputView.inputQuantity();


    }

    private void validateMenus(int menuNumber) {
        boolean isContain = menus.stream()
                .map(menu -> menu.getNumber())
                .anyMatch(t -> t == menuNumber);
        if (!isContain) {
            throw new MenuException(ErrorCode.MENU_NOT_CONTAINS_NUMBER);
        }
    }

    private void validateTables(int tableNumber) {
        boolean isContain = tables.stream()
                .map(table -> table.getNumber())
                .anyMatch(t -> t == tableNumber);
        if (!isContain) {
            throw new TableException(ErrorCode.Table_NOT_CONTAINS_NUMBER);
        }
    }
}
