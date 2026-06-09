package com.mlkbrv.spring.scope.bean;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class ObjectProviderExample {
    private final ObjectProvider<Waiter> waiterProvider;
    private final ObjectProvider<HeadChef> headChefProvider;

    public ObjectProviderExample(ObjectProvider<Waiter> waiterProvider, ObjectProvider<HeadChef> headChefProvider) {
        this.waiterProvider = waiterProvider;
        this.headChefProvider = headChefProvider;
    }
    public void getAndCompareHeadChef() {
        HeadChef headChef = headChefProvider.getObject();
        HeadChef headChef2 = headChefProvider.getObject();
        System.out.println(headChef==headChef2);
    }
    public void getAndCompareWaiter() {
        Waiter waiter = waiterProvider.getObject();
        Waiter waiter2 = waiterProvider.getObject();
        System.out.println(waiter==waiter2);
    }
}
