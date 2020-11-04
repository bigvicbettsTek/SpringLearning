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

  public Integer returnNull() {
    return null;
  }

  public int d(int a, int b) {
    if (b == 0) return Integer.MAX_VALUE;
    else return a / b;
  }
}
