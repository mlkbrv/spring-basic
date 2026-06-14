package com.mlkbrv.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {

    @Pointcut("execution(* addd*(..))")
    public void allAddMethods() {}
}
