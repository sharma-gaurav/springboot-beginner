package com.springboot.intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.springboot.intro,com.springboot.resource")
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        String[] beanNames = ctx.getBeanDefinitionNames();

        for (String name : beanNames) {
            System.out.println(name);
        }
    }
}
