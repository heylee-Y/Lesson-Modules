package spring.SpringBeanLife;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.config.AppConfig;
import sun.jvm.hotspot.runtime.PerfDataPrologue;

public class AcPeopleServiceTest {

    public static void main(String[] args) {

        System.out.println("开始初始化容器");
//        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"WEB-INF/ac.xml"});
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

//        People people = (People) ac.getBean("people");
//        System.out.println(people);

        System.out.println("关闭容器");
//        ((ClassPathXmlApplicationContext)ac).close();
        ((AnnotationConfigApplicationContext)ac).close();

    }
}
