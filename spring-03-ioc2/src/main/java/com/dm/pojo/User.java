package com.dm.pojo;

public class User {
  public String getName() {
    return name;
  }

  //  public User() {
  //    System.out.println("user的无参构造!");
  //  }

  public User(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String name;

  public void show() {
    System.out.println("name=" + name);
  }
}
