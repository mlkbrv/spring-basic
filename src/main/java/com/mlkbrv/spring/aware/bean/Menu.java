package com.mlkbrv.spring.aware.bean;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;

@Component
public class Menu implements ResourceLoaderAware {

    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void printMenu(){
        try{
            System.out.println(resourceLoader.getResource("classpath:menu.txt").getContentAsString(Charset.defaultCharset()));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
