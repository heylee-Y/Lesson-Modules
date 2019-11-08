package com.heylee.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class B {

//    @Autowired
//    private A a;
//
    public B() {
        System.out.println("B construct");
    }

    @PostConstruct
    public void init() {
        initB();
    }

    private void initB(){
        System.out.println("B init");
    }
}
