package com.heylee.rpc.Socket_Serializable.consumer.app;

import com.heylee.rpc.Socket_Serializable.consumer.service.CalculatorRemoteImpl;
import com.heylee.rpc.Socket_Serializable.provider.service.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsumerApp {

    String name;
    private static Logger logger = LoggerFactory.getLogger(ConsumerApp.class);

    public static void main(String[] args) {
        Calculator calculator = new CalculatorRemoteImpl();
        int result = calculator.add(1, 2);
        logger.info("result is {}", result);
    }
}
