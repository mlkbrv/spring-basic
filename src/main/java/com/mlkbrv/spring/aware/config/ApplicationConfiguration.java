package com.mlkbrv.spring.aware.config;


import com.mlkbrv.spring.aware.bean.Chef;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mlkbrv.spring.aware")
public class ApplicationConfiguration {

    @Bean
    public Chef restaurantChef(){
        return new Chef();
    }

}
