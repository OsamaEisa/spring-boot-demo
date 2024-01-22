package com.springbootdemo.myfirstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
    // expose "/workout" that return a string
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Let's run 5k!";
    }
}

/*
*   @RestController
    @RequestMapping("/")
    public class FunRestController { }
* */
