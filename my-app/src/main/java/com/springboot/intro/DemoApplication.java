package com.springboot.intro;

import com.springboot.component.UserProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan("com.springboot")
@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        UserProperty userProperty = ctx.getBean(UserProperty.class,"userProperty");
        System.out.println(userProperty);

//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//        for (String name : beanNames) {
//            System.out.println(name);
//        }
    }
}
