package domain.order;

import domain.menu.Menu;
import domain.menu.MenuRepository;
import domain.table.Table;
import domain.table.TableRepository;
import exception.ErrorCode;
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
        validateTables(tableNumber);
        
    }

    private void validateTables(int tableNumber) {
        if (!tables.contains(tableNumber)) {
            throw new TableException(ErrorCode.NOT_CONTAINS_NUMBER);
        }
    }
}
