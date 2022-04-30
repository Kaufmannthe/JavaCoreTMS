package by.TMSTasks.lesson9_InputAndOutput.Task3_BlackList;

public class BlackListExceptions extends Exception {

    public BlackListExceptions() {
    }

    public BlackListExceptions(String message) {
        super(message);
    }

    public BlackListExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public BlackListExceptions(Throwable cause) {
        super(cause);
    }

    public BlackListExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
