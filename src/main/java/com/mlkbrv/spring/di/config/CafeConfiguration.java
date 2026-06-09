package com.mlkbrv.spring.di.config;

import com.mlkbrv.spring.di.bean.Kitchen;
import com.mlkbrv.spring.di.bean.Waiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mlkbrv.spring.di")
public class CafeConfiguration {
    @Bean
    public Waiter waiter(Kitchen kitchen) {
        return new Waiter(kitchen);
    }
}
