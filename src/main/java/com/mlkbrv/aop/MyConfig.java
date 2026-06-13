package com.mlkbrv.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.mlkbrv.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
