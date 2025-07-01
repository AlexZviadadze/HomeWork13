package com.example.HomeWork13.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerForGreeting {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name){
        return "Hello " + name;
    }
}
