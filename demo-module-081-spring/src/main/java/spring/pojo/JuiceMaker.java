package spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JuiceMaker {

    //    @Autowired
    private Source source;

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String makeJuice() {
        String juice = "xxx用户点了一杯" + source.getFruit() + source.getSugar() + source.getSize();
        return juice;
    }


    public void initIt() {
        System.out.println("execute init method");
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("@PostConstruct execute method");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("@PreDestroy execute method");
    }
}
