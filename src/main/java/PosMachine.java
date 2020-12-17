import exception.BusinessException;
import exception.ErrorCode;
import view.InputView;
import view.MainView;
import view.Option;

public class PosMachine {

    public PosMachine() {
    }

    public void start() {
        MainView.print();
        int mainOption = InputView.inputMainOption();
        chooseOption(mainOption);
    }

    private void chooseOption(int mainOption) {
        if (mainOption == Option.Main_ONE.getOption()) {

        }
        if (mainOption == Option.Main_TWO.getOption()) {

        }
        if (mainOption == Option.Main_THREE.getOption()) {

        }
        throw new BusinessException(ErrorCode.CANNOT_CHOOSE_OPTION);
    }


}
