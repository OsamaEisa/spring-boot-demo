package com.springbootdemo.myfirstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject some custom properties
    @Value("${employee.name}")
    private String emplName;
    @Value("${company.name}")
    private String compName;

    // expose new endpoint for teamInfo
    @GetMapping("/teaminfo")
    public String getTeamInfo() { return "Employee: " + emplName + " is working at: " + compName; }

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
