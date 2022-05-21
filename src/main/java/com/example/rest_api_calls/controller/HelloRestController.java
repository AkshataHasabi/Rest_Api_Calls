package com.example.rest_api_calls.controller;

import com.example.rest_api_calls.model.User;
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

    @GetMapping("/param/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " From BridgeLabz";
    }

    @PostMapping ("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " !";
    }

    @PutMapping ("/put/{FirstName}")
    public String sayHelloPut(@PathVariable String FirstName,@RequestParam String lastName) {
        return "Hello" + FirstName + " " +lastName+ " !";
    }
}
