package demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTest {

    private static org.apache.log4j.Logger logger1 = org.apache.log4j.Logger.getLogger(LogTest.class);

    private static Logger logger2 = LogManager.getLogger(LogTest.class);

    public static void main(String[] args) {

        logger1.info("Cool!!! This is a info logs message.");

        logger1.warn("Cool!!! This is a warning logs message.");

        logger1.error("Cool!!! This is a error logs message.");

        logger1.error("Oops error!!!", new NullPointerException("NullError"));

        System.out.println("--------------------------------------------");

        logger2.info("Cool!!! This is a info logs message.");

        logger2.warn("Cool!!! This is a warning logs message.");

        logger2.error("Cool!!! This is a error logs message.");

        logger2.error("Oops error again!!!", new NullPointerException("NullErrorAgain"));
    }
}
