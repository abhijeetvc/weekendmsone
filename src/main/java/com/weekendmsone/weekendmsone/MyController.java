package com.weekendmsone.weekendmsone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${message:hello msone}")
    private String message;

    @GetMapping("/checkmsone")
    public String check(){
        return message;
    }
}
