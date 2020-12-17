package exception;

public class TableException extends IllegalArgumentException {
    private final ErrorCode errorCode;

    public TableException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}