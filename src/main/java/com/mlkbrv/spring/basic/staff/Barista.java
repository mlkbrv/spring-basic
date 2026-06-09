package com.mlkbrv.spring.basic.staff;


import org.springframework.stereotype.Component;

@Component
public class Barista {
    public void makeCoffee() {
        System.out.println("Barista make coffee");
    }
}
