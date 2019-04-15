package spring.aspectJ;

public interface PassengerDao {

    void addPassenger();

    String addPassengerReturnValue();

    void addPassengerThrowException() throws Exception;

    void addPassengerAround(String name);
}
