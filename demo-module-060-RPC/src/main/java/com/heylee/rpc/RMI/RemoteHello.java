package com.heylee.rpc.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteHello extends Remote {

    String sayHello(String name) throws RemoteException;
}
