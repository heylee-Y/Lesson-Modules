package base.exception;

/**
 * @author heylee
 */
public class TechnicalException extends BaseException {

    public TechnicalException(String message) {
        super(message);
    }

    public TechnicalException(Exception e) {
        super(e);
    }

    public TechnicalException(String message, Exception e) {
        super(message, e);
    }

    public TechnicalException(int code, String message) {
        super(code, message);
    }

    public TechnicalException(int code, String message, Exception e) {
        super(code, message, e);
    }

    public TechnicalException() {
        super();
    }
}
