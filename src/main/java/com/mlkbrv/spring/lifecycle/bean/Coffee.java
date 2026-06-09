package com.mlkbrv.spring.lifecycle.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Coffee {
    private final String type;
    public Coffee(String type) {
        this.type = type;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Making Coffee " + this.type);
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Closing Coffee " + this.type);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                '}';
    }
}
