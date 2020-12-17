package exception;

public class MenuException extends IllegalArgumentException {
    private final ErrorCode errorCode;

    public MenuException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}