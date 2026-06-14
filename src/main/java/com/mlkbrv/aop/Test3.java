package com.mlkbrv.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("MAIN START");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean(UniLibrary.class);
        String book = uniLibrary.returnBook();
        System.out.println(book);

        context.close();
        System.out.println("MAIN END");
    }
}
