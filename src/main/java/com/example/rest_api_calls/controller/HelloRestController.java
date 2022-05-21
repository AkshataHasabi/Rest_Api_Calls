package com.example.rest_api_calls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @RequestMapping(value = {"", "/" }, method = RequestMethod.GET)
    public String sayHello() {
        return "Hello from Bridgelabz";
    }
}
