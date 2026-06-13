package com.mlkbrv.aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("com.mlkbrv.aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: попытка получить книгу/журнал");
        System.out.println("-----------------------------------------------------");
    }
}
