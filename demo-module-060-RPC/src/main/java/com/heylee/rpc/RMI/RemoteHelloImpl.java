package com.heylee.rpc.RMI;

import java.rmi.RemoteException;

public class RemoteHelloImpl implements RemoteHello {
    public String sayHello(String name) throws RemoteException {
        return String.format("Hello, %s!", name);
    }
}
