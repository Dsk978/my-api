package com.ty.myapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMyController {
    @GetMapping
    public String Hello(){
        return "Hello Springboot";
    }
}
