import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.dao.DemoUserDaoImpl;
import spring.model.DemoUser;
import spring.pojo.Customer;
import spring.pojo.JuiceMaker;
import spring.pojo.Source;

import java.util.List;

public class TestSpring {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"WEB-INF/applicationContext.xml"});

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Source source = (Source) context.getBean("source");
        System.out.println(source.getFruit());
        System.out.println(source.getSugar());
        System.out.println(source.getSize());

        JuiceMaker juiceMaker = (JuiceMaker) context.getBean("juiceMaker");
        System.out.println(juiceMaker.makeJuice());
//
//        DemoUser demoUser = new DemoUser();
//        demoUser.setId(7L);
//        demoUser.setName("haili");
//        demoUser.setRole("admin");
//        demoUser.setComment("Aha!!!");
//        DemoUserDaoImpl demoUserDao = (DemoUserDaoImpl) context.getBean("demoUserDao");
//        demoUserDao.insert(demoUser);
//
//        DemoUser demoUser1 = demoUserDao.findUserById(1L);
//        System.out.println(demoUser1.getName() + "***" + demoUser1.getUpdateTime());
//
//        List<DemoUser> list = demoUserDao.findAllUsers();
//        for (DemoUser user : list) {
//            System.out.println(user.getName() + " --- " + user.getUpdateTime());
//        }
//
//        Customer customer = (Customer) context.getBean("customerBean");
//        System.out.println(customer.getItemName() + "  " + customer.getItem().getQty());

        ((ClassPathXmlApplicationContext) context).close();
    }
}
