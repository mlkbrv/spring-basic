package com.mlkbrv.aop.aspects;

import com.mlkbrv.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(1)
public class LoggingAspect {
    @Before("com.mlkbrv.aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddSecurityAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature);
        System.out.println(methodSignature.getMethod());
        System.out.println(methodSignature.getDeclaringType());
        System.out.println(methodSignature.getReturnType());
        System.out.println(methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for(Object arg : args) {
                if(arg instanceof Book) {
                    Book book = (Book)arg;
                    System.out.println("Book: " + book.getAuthor()+" "+book.getBookName());
                }
                else if(arg instanceof String) {
                    System.out.println("String: " + arg);
                }
            }
        }

        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
        System.out.println("-----------------------------------------------------");
    }
}
