package exception;

public class InputViewException extends IllegalArgumentException {
    private final ErrorCode errorCode;

    public InputViewException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
