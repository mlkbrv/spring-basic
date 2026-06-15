package com.mlkbrv.spring.spel.bean;


import com.mlkbrv.spring.spel.annotations.Sentence;
import org.springframework.stereotype.Component;

@Component
public class Waiter {

    //    @Sentence(expression = "#root.setGreetingMessage(#bean)")
    @Sentence(expression = "setGreetingMessage(#bean)")
    private String greeting;

    public void printGreetings() {
        System.out.println("Waiter greet: " + greeting);
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}