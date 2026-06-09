package com.mlkbrv.spring.lifecycle;

import com.mlkbrv.spring.lifecycle.bean.CoffeeShop;
import com.mlkbrv.spring.lifecycle.config.LifeCycleConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        CoffeeShop coffeeShop = context.getBean(CoffeeShop.class);
//        coffeeShop.makeCoffee();
//        coffeeShop.makeCoffee("latte");
        coffeeShop.makeCoffee("latte","milk");
        coffeeShop.makeCoffee("latte","sugar");
        context.close();
    }
}
