package com.parkus.autowiring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
            "com/parkus/autowiring/annotations/config.xml");

        Employee employee = (Employee) ctx.getBean("employee");

        System.out.println(employee);

    }
}
