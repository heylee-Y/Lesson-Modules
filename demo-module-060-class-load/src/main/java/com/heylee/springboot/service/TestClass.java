package com.heylee.springboot.service;

import org.springframework.stereotype.Repository;

@Repository
public class TestClass {

    public TestClass() {
        System.out.println("Test Class Construct");

    }

    @Override
    public String toString() {
        return "Test Class to string method";
    }
}
