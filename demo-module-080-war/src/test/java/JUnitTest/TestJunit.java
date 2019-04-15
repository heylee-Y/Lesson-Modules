package JUnitTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {

    String message = "Hello Heylee";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void testPrintMessageError() {
//        message = "hello haili";
        assertEquals(message, messageUtil.printMessage());
    }
}
