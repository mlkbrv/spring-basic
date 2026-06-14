package com.mlkbrv.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("pitalis");
        Object res;
        try {
            res = pjp.proceed();
            res = "Prestupleniye i nakazaniye";
        } catch (Exception e) {
            System.out.println("Exception!!!!!!!!");
//            res = "Neizvestno";
            throw e;
        }
        System.out.println("aroundReturnBookLoggingAdvice");
        return res;
    }
}
