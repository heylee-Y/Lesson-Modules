package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import spring.SpringBeanLife.People;
import spring.pojo.JuiceMaker;

@Configuration
@ComponentScan(basePackages = "spring.SpringBeanLife")
public class AppConfig {

//    @Bean(name = "juiceMaker")
//    public JuiceMaker juiceMaker() {
//        return new JuiceMaker();
//    }

    // 为了定义初始化方法， destroy method , 如果只是为了注入， 仅仅在类上加 @Component @Controller @Service @Repository
    @Bean(initMethod = "myInit", destroyMethod = "myDestroy")
    // 指定bean scope
//    @Scope("prototype")
    @Scope("singleton")
    public People people() {
        People people = new People();
        people.setName("Heylee");
        return people;
    }
}
