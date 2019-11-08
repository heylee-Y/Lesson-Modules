package spring.SpringBeanLife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class People implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String name;

    public People() {
        System.out.println("PersonService类构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set方法被调用");
    }

    @Override
    public String toString() {
        return "People Name: " + name;
    }

    public void setBeanName(String beanName) {
        System.out.println("setBeanName被调用,beanName:" + beanName);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory被调用,beanFactory");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext被调用");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet被调用");
    }

    public void destroy() throws Exception {
        System.out.println("destory被调用");
    }

    //自定义的初始化函数
    public void myInit() {
        System.out.println("myInit被调用");
    }

    //自定义的销毁方法
    public void myDestroy() {
        System.out.println("myDestroy被调用");
    }
}
