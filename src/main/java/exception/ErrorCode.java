package exception;

public enum ErrorCode {
    //InputView
    INVALID_INPUT_VALUE("I001", "숫자만 입력해주세요."),
    CANNOT_CHOOSE_OPTION("I002", "선택할 수 없는 기능입니다.");

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
