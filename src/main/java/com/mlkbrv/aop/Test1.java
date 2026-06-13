package com.mlkbrv.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean(UniLibrary.class);
        Book book = context.getBean(Book.class);

        uniLibrary.addBook("Emil", book);

        context.close();
    }
}
