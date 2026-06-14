package com.mlkbrv.aop.aspects;


import com.mlkbrv.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("Entering BeforeGetStudentsLoggingAdvice()");
    }

    @AfterReturning(pointcut = "execution(* getStudents())",
    returning = "students")
    public void afterGetStudentsLoggingAdvice(List<Student> students) {
        Student student = students.get(0);
        student.setNameSurname("Mr. E");
        System.out.println("Entering AfterGetStudentsLoggingAdvice()");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())",
    throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("Logging "+exception.getMessage());
        System.out.println("Entering AfterThrowingGetStudentsLoggingAdvice()");
    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("Entering AfterGetStudentsLoggingAdvice()");
    }
}
