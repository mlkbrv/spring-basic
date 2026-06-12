package com.mlkbrv.spring.postprocessor.processor;

import com.mlkbrv.spring.postprocessor.annotation.Discount;
import com.mlkbrv.spring.postprocessor.bean.Food;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class DiscountableBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {


        if (bean instanceof Food food) {
            try {
                Field field = Food.class.getDeclaredField("discount");
                field.setAccessible(true);

                Discount discount = field.getAnnotation(Discount.class);

                if (discount != null) {
                    if ("Pasta".equals(food.getType())) {
                        food.setDiscount(discount.percent());
                    }
                } else {
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return bean;
    }
}