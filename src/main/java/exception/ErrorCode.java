package exception;

public enum ErrorCode {
    //general
    CANNOT_CHOOSE_OPTION("B001", "선택할 수 없는 기능입니다."),

    //InputView
    INVALID_INPUT_VALUE("In001", "숫자만 입력해주세요.");

    private final String Code;
    private final String message;

    ErrorCode(String code, String message) {
        Code = code;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
