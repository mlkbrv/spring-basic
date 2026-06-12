package com.mlkbrv.spring.props.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Restaurant {
    @Value("${restaurant.name}")
    private String name;

    @Value("${restaurant.capacity}")
    private int capacity;

    @Value("#{'${restaurant.menu.itemsString}'.split(',')}")
    private List<String> menuItems;

    @Value("${restaurant.description:default desc}")
    private String description;

    public void printMainInfo()
    {
        System.out.println(name);
        System.out.println(capacity);
        System.out.println(description);
    }
    public void printMenuInfo()
    {
        System.out.println(menuItems);
    }
}
