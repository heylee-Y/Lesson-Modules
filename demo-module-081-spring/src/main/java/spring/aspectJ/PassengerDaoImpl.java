package spring.aspectJ;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

@Repository("PD")
public class PassengerDaoImpl implements PassengerDao {
    public void addPassenger() {
        System.out.println("addPassenger() is running");
    }

    public String addPassengerReturnValue() {
        System.out.println("addPassengerReturnValue() is running");
        return "abc";
    }

    public void addPassengerThrowException() throws Exception {
        System.out.println("addPassengerReturnValue() is running");
        throw new Exception("Generic Error");
    }

    public void addPassengerAround(String name) {
        System.out.println("addPassengerAround() is running, args : " + name);
    }
}
