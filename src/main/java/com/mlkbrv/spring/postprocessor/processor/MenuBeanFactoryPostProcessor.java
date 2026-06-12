package com.mlkbrv.spring.postprocessor.processor;

import com.mlkbrv.spring.postprocessor.bean.Food;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class MenuBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.registerSingleton("openTime", LocalTime.of(10,0));

        addFoodBean("Meat","Steak", (DefaultListableBeanFactory) beanFactory);
        addFoodBean("Pasta","Pasta", (DefaultListableBeanFactory) beanFactory);
    }

    private void addFoodBean(String type, String dishName, DefaultListableBeanFactory beanFactory) {
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(Food.class);
        beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, type);
        beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(1,dishName);
        beanFactory.registerBeanDefinition(dishName.toLowerCase(),beanDefinition);
    }
}
