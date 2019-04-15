package base.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author heylee
 */
public class BaseException extends Exception implements IExceptionCode {

    private static final long serialVersionUID = 1L;

    private static final Logger log = LoggerFactory.getLogger(BaseException.class);

    private int code;
    private String message;

    public BaseException() {
        this(E_UNKNOWN, "");
    }

    public BaseException(String message) {
        this(E_UNKNOWN, message);
    }

    public BaseException(Exception e) {
        this(E_UNKNOWN, "", e);
    }

    public BaseException(String message, Exception e) {
        this(E_UNKNOWN, message, e);
    }

    public BaseException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
        log.error(toString());
    }

    public BaseException(int code, String message, Exception e) {
        super(message, e);
        this.code = code;
        this.message = message;
        log.error(toString());
    }


    private int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "CODE [" + getCode() + "] MSG: " + getMessage() + " => " + super.toString();
    }
}
