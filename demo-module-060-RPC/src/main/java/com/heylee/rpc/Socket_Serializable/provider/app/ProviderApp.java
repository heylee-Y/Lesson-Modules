package com.heylee.rpc.Socket_Serializable.provider.app;

import com.heylee.rpc.Socket_Serializable.provider.service.Calculator;
import com.heylee.rpc.Socket_Serializable.provider.service.CalculatorImpl;
import com.heylee.rpc.Socket_Serializable.request.CalculateRpcRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auther WJM created on 2019-07-12 17:41:01
 */
public class ProviderApp {

    private static Logger logger = LoggerFactory.getLogger(ProviderApp.class);

    private Calculator calculator = new CalculatorImpl();

    public static void main(String[] args) throws IOException {
        new ProviderApp().run();
    }

    private void run() throws IOException {
        ServerSocket listener = new ServerSocket(9090);
        try {
            while (true) {
                Socket socket = listener.accept();
                try {
                    // 将请求反序列化
                    ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                    Object object = objectInputStream.readObject();

                    logger.info("request is {}", object);

                    // 调用服务
                    int result = 0;
                    if (object instanceof CalculateRpcRequest) {
                        CalculateRpcRequest calculateRpcRequest = (CalculateRpcRequest) object;
                        if ("add".equals(calculateRpcRequest.getMethod())) {
                            result = calculator.add(calculateRpcRequest.getA(), calculateRpcRequest.getB());
                        } else {
                            throw new UnsupportedOperationException();
                        }
                    }

                    // 返回结果
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                    objectOutputStream.writeObject(new Integer(result));

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } finally {
                    socket.close();
                }
            }
        } finally {
            listener.close();
        }
    }
}
