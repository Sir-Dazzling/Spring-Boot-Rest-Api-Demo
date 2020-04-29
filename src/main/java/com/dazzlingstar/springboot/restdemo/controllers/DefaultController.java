package com.dazzlingstar.springboot.restdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DefaultController
{
    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello()
    {
        return "Hello World! My name is Otti Daniel Onyedikachi, i love java and the Time on server is " + LocalDateTime.now();
    }

    @GetMapping("/messages")
    public String getMessages()
    {
        return "Lol I have a crush on someone so beautiful";
    }
}
