package com.example.rest_api_calls.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {
    @RequestMapping(value = {"", "/" }, method = RequestMethod.GET)
    public String sayHello() {
        return "Hello from Bridgelabz";
    }

    @RequestMapping(value = {"", "/queryparam" }, method = RequestMethod.GET)
    public String sayHelloMessage(@RequestParam (value = "name") String name) {
        return "Hello"+name+ "from Bridgelabz";
    }

    @GetMapping("/query")
    public String sayHelloParam(@RequestParam String name) {
        return "Hello "+name+" From BridgeLabz";
    }
}
