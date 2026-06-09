package com.mlkbrv.spring.scope.bean;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class OrderProcessor {
    private final ObjectProvider<Waiter> waiterProvider;
    private final HeadChef headChef;

    public OrderProcessor(ObjectProvider<Waiter> waiterProvider, HeadChef headChef) {
        this.waiterProvider = waiterProvider;
        this.headChef = headChef;
    }
    public void processOrder(String order,int table) {
        Waiter waiter = waiterProvider.getObject();
        waiter.takeOrder(order,table);
        headChef.makeOrder(waiter);
    }
}
