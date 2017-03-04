package com.springboot.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Value("${default.message}")
    private String defaultMessage;

    @Value("${default.comment}")
    private String defaultComment;

    @RequestMapping("/")
    public String showMessage() {
        return defaultMessage + ". " + defaultComment;
    }
}
