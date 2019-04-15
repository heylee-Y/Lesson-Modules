import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.pojo.JuiceMaker;
import spring.pojo.Source;

public class TestAOP {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"WEB-INF/applicationContext.xml"});

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Source source = (Source) context.getBean("source");
        Source source = (Source) context.getBean("source");
        System.out.println("*************************");
        source.printFruit();
        System.out.println("*************************");
        source.printSize();
        System.out.println("*************************");
        try {
            source.printThrowException();
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}
