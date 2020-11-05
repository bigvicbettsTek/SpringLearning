package com.hello.hello.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

  @GetMapping
  public String getHello() {
    return "Hello World";
  }

  @PostMapping
  public String postHello(@RequestBody String name) {
    return "Hello " + name;
  }
}
