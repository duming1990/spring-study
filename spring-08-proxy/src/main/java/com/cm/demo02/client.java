package com.cm.demo02;

public class client {
  public static void main(String[] args) {
    UserServiceImpl userService = new UserServiceImpl();
    UserServiceProxy userServiceProxy = new UserServiceProxy();
    userServiceProxy.setUserServiceimpl(userService);
    userServiceProxy.add();
  }
}
