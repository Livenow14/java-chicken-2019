package view;

import exception.ErrorCode;
import exception.InputViewException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

class InputViewTest {
    private static Scanner scanner;

    public static void inputScanner(String inputText) {
        InputStream inputStream = new ByteArrayInputStream(inputText.getBytes());
        System.setIn(inputStream);
        scanner = new Scanner(inputStream);
    }

    @Test
    @DisplayName("숫자만 입력해야한다.")
    void testinputValue() {
        //given
        String inputValue = "1";
        inputScanner(inputValue);

        //when
        int intOption = InputView.inputMainOption();

        //then
        Assertions.assertThat(intOption).isEqualTo(1);
    }

    @Test
    @DisplayName("숫자가 아닐시 에러가 발생한다.")
    void testinputValueError() {
        //given
        String inputValue = "a";
        inputScanner(inputValue);

        //when
        Assertions.assertThatThrownBy( () -> InputView.inputMainOption() )
                .isInstanceOf(InputViewException.class)
                .hasMessage(ErrorCode.INVALID_INPUT_VALUE.getMessage());
    }

    @Test
    @DisplayName("보장된 기능이 아닐시 에러가 발생한다.")
    void testinputValueNotAccept() {
        //given
        String inputValue = "-1";
        inputScanner(inputValue);

        //when
        Assertions.assertThatThrownBy( () -> InputView.inputMainOption() )
                .isInstanceOf(InputViewException.class)
                .hasMessage(ErrorCode.CANNOT_CHOOSE_OPTION.getMessage());
    }
}