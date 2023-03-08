package com.parkus.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
            "com/parkus/standalone/collections/config.xml");

        ProductList pl = (ProductList) ctx.getBean("productList");

        System.out.println(pl);
    }
}
