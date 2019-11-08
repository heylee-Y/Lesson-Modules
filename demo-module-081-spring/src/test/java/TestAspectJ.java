import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.aspectJ.PassengerDao;
import spring.aspectJ.PassengerDaoImpl;

public class TestAspectJ {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"WEB-INF/applicationContext.xml"});

        PassengerDao passengerDao = (PassengerDao) context.getBean("PD");

//        PassengerDaoImpl passengerDao1 = new PassengerDaoImpl();
//        passengerDao1.addPassenger();

        passengerDao.addPassenger();
    }
}
