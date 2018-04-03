package com.greenfoxacademy.springstart.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloRESTController {

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam("name") String name) {

    Greeting greeting = new Greeting("Hello " + name);
    return greeting;
  }

}
