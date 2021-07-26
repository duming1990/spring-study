package com.dm.pojo;

public class Hello {
  @Override
  public String toString() {
    return "Hello{" + "str='" + str + '\'' + '}';
  }

  private String str;

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;
  }
}
