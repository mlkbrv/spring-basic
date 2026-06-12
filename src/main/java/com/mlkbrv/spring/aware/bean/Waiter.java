package com.mlkbrv.spring.aware.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Waiter implements ApplicationContextAware, BeanFactoryAware, EnvironmentAware{

    private Environment environment;

    private BeanFactory beanFactory;

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void takeFood(String foodName){
        System.out.println("takeFood "+foodName);
//        applicationContext.getBean(Chef.class).cook(foodName);
        beanFactory.getBean(Chef.class).cook(foodName);
    }

    public void greetCustomer(){
        String dayTime = environment.getProperty("dayTime");
        System.out.println("Good "+dayTime);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
