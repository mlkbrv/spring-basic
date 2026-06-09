package com.mlkbrv.spring.scope;

import com.mlkbrv.spring.scope.bean.HeadChef;
import com.mlkbrv.spring.scope.bean.ObjectProviderExample;
import com.mlkbrv.spring.scope.bean.OrderProcessor;
import com.mlkbrv.spring.scope.bean.Waiter;
import com.mlkbrv.spring.scope.config.RestaurantConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RestaurantApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RestaurantConfig.class);
//        System.out.println(context.getBean(HeadChef.class)==context.getBean(HeadChef.class));
//        System.out.println(context.getBean(Waiter.class)==context.getBean(Waiter.class));
//        HeadChef headChef = context.getBean(HeadChef.class);
//        HeadChef headChef2 = context.getBean(HeadChef.class);
//        headChef.setName("Head Chef");
//        System.out.println(headChef.getName());
//        System.out.println(headChef2.getName());
//        Waiter waiter = context.getBean(Waiter.class);
//        Waiter waiter2 = context.getBean(Waiter.class);
//        waiter.setOrder("Coffee");
//        System.out.println(waiter);
//        System.out.println(waiter2);
//        ObjectProviderExample objectProviderExample = context.getBean(ObjectProviderExample.class);
//        objectProviderExample.getAndCompareHeadChef();
//        objectProviderExample.getAndCompareWaiter();
        OrderProcessor orderProcessor = context.getBean(OrderProcessor.class);
        orderProcessor.processOrder("Coffe",2);
    }
}
