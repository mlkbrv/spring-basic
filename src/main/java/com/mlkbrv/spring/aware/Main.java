package com.mlkbrv.spring.aware;

import com.mlkbrv.spring.aware.bean.Menu;
import com.mlkbrv.spring.aware.bean.Waiter;
import com.mlkbrv.spring.aware.config.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Waiter waiter = context.getBean(Waiter.class);
        waiter.greetCustomer();
        waiter.takeFood("Salad");


        Menu menu = context.getBean(Menu.class);
        menu.printMenu();
        context.close();
    }
}
