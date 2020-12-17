import domain.menu.Menu;
import domain.menu.MenuRepository;
import domain.order.OrderService;
import domain.table.Table;
import domain.table.TableRepository;
import exception.BusinessException;
import exception.ErrorCode;
import view.InputView;
import view.MainView;
import view.Option;

import java.util.List;

public class PosMachine {
    private final List<Menu> menus;
    private final List<Table> tables;

    private PosMachine(List<Menu> menus, List<Table> tables) {
        this.menus = menus;
        this.tables = tables;
    }

    public static PosMachine init() {
        return new PosMachine(MenuRepository.menus(), TableRepository.tables());
    }

    public void start() {
        MainView.print();
        int mainOption = InputView.inputMainOption();
        chooseOption(mainOption);
    }

    private void chooseOption(int mainOption) {
        validateOption(mainOption);
        if (mainOption == Option.Main_ONE.getOption()) {
            orderManage();
        }
        if (mainOption == Option.Main_TWO.getOption()) {

        }
        if (mainOption == Option.Main_THREE.getOption()) {

        }
    }

    private void validateOption(int mainOption) {
        if (mainOption == Option.Main_ONE.getOption()) {
            return;
        }
        if (mainOption == Option.Main_TWO.getOption()) {
            return;
        }
        if (mainOption == Option.Main_THREE.getOption()) {
            return;
        }
        throw new BusinessException(ErrorCode.CANNOT_CHOOSE_OPTION);
    }

    private void orderManage() {
        OrderService orderService = OrderService.init();
        orderService.createOrder();
    }
}
