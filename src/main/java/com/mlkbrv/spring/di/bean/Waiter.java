package com.mlkbrv.spring.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Waiter {
//    @Autowired
    private final Kitchen kitchen;

    public Waiter(Kitchen kitchen){
        this.kitchen = kitchen;
    }

//    @Autowired
//    public void setKitchen(Kitchen kitchen) {
//        this.kitchen = kitchen;
//    }

    public void takeOrder(String order){
        System.out.println("Taking order: " + order);
        kitchen.cook(order);
    }
}
