package com.hello.hello;

public class SomeClass {

  public SomeClass() {
    String name = "Name";

    int someInt = 17;

    someInt = 18;
    System.out.println("*******************" + returnNum(someInt) + "*******************");
  }

  public int returnNum(int newNum) {
    return newNum;
  }
}
