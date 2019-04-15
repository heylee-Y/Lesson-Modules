package Test;

import base.exception.TechnicalException;

public class TestException {

    public static void main(String[] args) {
        try {
            throw new TechnicalException("Aha!!!");
        } catch (TechnicalException e) {
            e.printStackTrace();
        }

        try {
            throw new TechnicalException("Wow!!!", new NullPointerException());
        } catch (TechnicalException e) {
            e.printStackTrace();
        }

        TestException obj = new TestException();
        try {
            obj.test();
        } catch (TechnicalException e) {
            e.printStackTrace();
        }
    }

    private void test() throws TechnicalException {
        System.out.println("method throws exception");
        throw new NullPointerException();
    }
}
