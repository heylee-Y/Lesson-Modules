package base.exception;

import java.math.BigDecimal;

/**
 * @author heylee
 * Holds all the Error codes which are used in the exception handling.
 */
public interface IExceptionCode {

    //database errors
    public static final int S_OK = 0;
    public static final BigDecimal S_OK_B = BigDecimal.ZERO;

    public static final int E_UNKNOWN = 1;
    public static final int E_INVALID_RANGE = 2;
    public static final int E_INVALID_RANGE_NOT_FREE = 3;
    public static final int E_INVALID_FORMCODE = 4;
    public static final int E_HISTORICIZE = 5;
    public static final int E_RECYCLE_HASALLOCATION = 6;
    public static final int E_INVALID_PARAMS = 7;
    public static final int E_RANGE_NOT_FOUND = 8;
    public static final int E_RANGE_IS_USED = 9;
    public static final int E_FORMCODE_FREEZE = 10;
    public static final int E_OVERRIDE = 11;

    //end database errors

    //hibernate errors
    public static final int E_CONSTRAINT_ERROR = 50;// if a code already exist

    public static final int E_NOT_IMPLEMENTED = 100;


    //user login
    public static final int E_LOGIN_FAIL = 110;
}
