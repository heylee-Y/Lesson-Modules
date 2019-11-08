package com.heylee.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@DependsOn({"b"})
@Service
public class A {

//    @Autowired
//    private B b;

    public A() {
        System.out.println("A construct");
    }

    @PostConstruct
    public void init() {
        initA();
    }

    public void initA() {
        System.out.println("A init");
    }
}
