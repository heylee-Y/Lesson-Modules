import aop.PassengerDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class TestAOP {

//    @Autowired
//    @Qualifier("PDI")
//    private PassengerDao passengerDao;

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"WEB-INF/applicationContext.xml"});

        PassengerDao passengerDao = (PassengerDao) context.getBean("PDI");

        passengerDao.addPassenger();
    }
}
