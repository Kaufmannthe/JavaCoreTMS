package by.tmstasks.exceptions.logincheck;

public class WrongPasswordConfirmationException extends Exception{
    public WrongPasswordConfirmationException() {
    }

    public WrongPasswordConfirmationException(String message) {
        super(message);
    }

    public WrongPasswordConfirmationException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongPasswordConfirmationException(Throwable cause) {
        super(cause);
    }

    public WrongPasswordConfirmationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
