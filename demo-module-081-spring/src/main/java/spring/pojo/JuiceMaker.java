package spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import spring.DI.Party;
import spring.DI.Person;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;

@Controller
public class JuiceMaker {

    @Autowired
    private Source source;

//    public JuiceMaker(Source source) {
//        this.source = source;
//    }

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

//****************Test DI*****************
//    测试1：注入时bean有歧义
//@Resource
//private Party party;

//@Autowired
//private Party party;

//@Inject
//private Party party;

//    测试2：变量名
//    @Autowired
//    private Party person;

//    @Inject
//    private Party person;

//    @Resource
//    private Party person;

//    变量类型
//@Resource
//private Person party;

//    @Autowired
//    private Person party;
//
//    @Inject
//    private Person party;

    // 仅仅是匹配的逻辑顺序不一样

    @Resource(name = "person")
//    @Qualifier("person")
    private Party party;

//    @Autowired
//    @Qualifier("person")
//    private Party party;
//
//    @Inject
//    @Qualifier("person")
//    private Party party;


}
