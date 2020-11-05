package com.hello.hello.controllers;

import java.util.Random;
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

  public Boolean returnNull() {
    return null;
  }

  String generateSecretToken() {
    Random r = new Random();
    return Long.toHexString(r.nextLong());
  }
}
