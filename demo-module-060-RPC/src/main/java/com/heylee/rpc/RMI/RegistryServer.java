package com.heylee.rpc.RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.concurrent.CountDownLatch;

public class RegistryServer {
    public static void main(String[] args) throws InterruptedException{
        try {
            LocateRegistry.createRegistry(8000); //Registry使用8000端口
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        CountDownLatch latch=new CountDownLatch(1);
        latch.await();  //挂起主线程，否则应用会退出
    }
}
