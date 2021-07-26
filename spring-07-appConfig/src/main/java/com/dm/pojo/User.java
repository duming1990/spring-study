package com.dm.pojo;

import org.springframework.beans.factory.annotation.Value;

// @Component
public class User {
  @Value("明神")
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" + "name='" + name + '\'' + '}';
  }
}
