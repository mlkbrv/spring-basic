package com.mlkbrv.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

//    @Pointcut("execution(* get*())")
//    private void allGetMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(* return*())")
//    private void allReturnMethodsFromUniLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("This is before getLoggingAdvice() #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturningAdvice() {
//        System.out.println("This is before returningAdvice() #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturningAdvice() {
//        System.out.println("This is before getAndReturningAdvice() #3");
//    }


}
