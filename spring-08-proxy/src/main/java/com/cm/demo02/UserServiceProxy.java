package com.cm.demo02;

public class UserServiceProxy implements UserService {
  private UserServiceImpl userServiceimpl;

  public void setUserServiceimpl(UserServiceImpl userServiceimpl) {
    this.userServiceimpl = userServiceimpl;
  }

  public void log(String msg) {
    System.out.println("使用了" + msg + "方法");
  }

  public void add() {
    log("add");
    userServiceimpl.add();
  }

  public void delete() {
    log("delete");
    userServiceimpl.delete();
  }

  public void update() {
    log("update");
    userServiceimpl.update();
  }

  public void query() {
    log("query");
    userServiceimpl.query();
  }
}
