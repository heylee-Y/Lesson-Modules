package aop;

import org.springframework.stereotype.Repository;


public interface PassengerDao {

    void addPassenger();

    String addPassengerReturnValue();

    void addPassengerThrowException() throws Exception;

    void addPassengerAround(String name);
}
