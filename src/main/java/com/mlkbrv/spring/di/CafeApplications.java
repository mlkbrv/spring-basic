package com.mlkbrv.spring.di;

import com.mlkbrv.spring.di.bean.Customer;
import com.mlkbrv.spring.di.bean.Kitchen;
import com.mlkbrv.spring.di.bean.Waiter;
import com.mlkbrv.spring.di.config.CafeConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CafeApplications {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CafeConfiguration.class);
        Customer customer = context.getBean("customer", Customer.class);
        customer.makeOrder("Salad");
    }
}
