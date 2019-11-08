package util;

import model.enums.LogEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {

    public static Logger getBusinessLogger() {
        return LoggerFactory.getLogger(LogEnum.BUSINESS.getCategory());
    }

    public static Logger getPlatformLogger() {
        return LoggerFactory.getLogger(LogEnum.PLATFORM.getCategory());
    }

    public static Logger getExceptionLogger() {
        return LoggerFactory.getLogger(LogEnum.EXCEPTION.getCategory());
    }

    public static Logger GetDBLogger() {
        return LoggerFactory.getLogger(LogEnum.DB.getCategory());
    }
}
