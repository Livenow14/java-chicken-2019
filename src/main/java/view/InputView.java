package view;

import exception.ErrorCode;
import exception.InputViewException;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputTableNumber() {
        System.out.println("## 주문할 테이블을 선택하세요.");
        return scanner.nextInt();
    }

    public static int inputMainOption() {
        String inputValue = inputNextLine();
        int option = stringToInt(inputValue);
        return option;
    }

    private static int stringToInt(String option) {
        try {
            return Integer.parseInt(option);
        } catch (Exception exception) {
            throw new InputViewException(ErrorCode.INVALID_INPUT_VALUE);
        }
    }

    private static String inputNextLine() {
        return scanner.nextLine();
    }
}
