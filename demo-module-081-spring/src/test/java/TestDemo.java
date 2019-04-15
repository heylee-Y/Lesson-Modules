import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.spring_dao.CustomerService;

public class TestDemo {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"WEB-INF/applicationContext.xml"});

        CustomerService customerService = (CustomerService) context.getBean("customerService");
//        CustomerService customerService = (CustomerService) context.getBean("AAA");
        System.out.println(customerService.toString());
    }

}
