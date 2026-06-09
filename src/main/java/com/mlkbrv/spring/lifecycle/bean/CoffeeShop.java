package com.mlkbrv.spring.lifecycle.bean;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;

@Component
public class CoffeeShop {

    private final ObjectProvider<Coffee> coffeeProvider;

    private final Map<String, Ingredient> ingredients;

    public CoffeeShop(ObjectProvider<Coffee> coffeeProvider, Map<String, Ingredient> ingredients) {
        this.coffeeProvider = coffeeProvider;
        this.ingredients = ingredients;
    }

    @PostConstruct
    public void openShop()
    {
        System.out.println("Shop is open");
    }

    public void makeCoffee()
    {
        System.out.println("Making Coffee");
    }

    public void makeCoffee(String type)
    {
        Coffee coffee = coffeeProvider.getObject(type);
        System.out.println("Making Coffee "+coffee);
    }

    public void makeCoffee(String type, String ingredient)
    {
        Coffee coffee = coffeeProvider.getObject(type);
        System.out.println("Making Coffee with ingredient "+ingredients.get(ingredient)+" "+coffee);
    }

    @PreDestroy
    public void closeShop()
    {
        System.out.println("Shop is closed");
    }
}

//@Component
//public class CoffeeShop implements InitializingBean, DisposableBean {
//
//    public void makeCoffee()
//    {
//        System.out.println("Making Coffee");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Shop is closed");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Shop is opened");
//    }
//}
