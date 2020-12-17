package exception;

public enum ErrorCode {
    //general
    CANNOT_CHOOSE_OPTION("B001", "선택할 수 없는 기능입니다."),

    //InputView
    INVALID_INPUT_VALUE("In001", "숫자만 입력해주세요."),

    //Table
    Table_NOT_CONTAINS_NUMBER("T001", "테이블에 포함된 숫자가 아닙니다."),

    //Menu
    MENU_NOT_CONTAINS_NUMBER("T001", "테이블에 포함된 숫자가 아닙니다.");

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
