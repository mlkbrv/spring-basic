package com.mlkbrv.spring.aware.bean;

import org.springframework.beans.factory.BeanNameAware;

public class Chef implements BeanNameAware {

    private String chefName;

    public void cook(String food){
        System.out.println("cook food "+food+" name "+chefName);
    }

    @Override
    public void setBeanName(String name) {
        this.chefName = name;
    }
}
