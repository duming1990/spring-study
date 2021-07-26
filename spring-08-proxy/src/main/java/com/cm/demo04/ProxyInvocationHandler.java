package com.cm.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 我们等会用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
  //    被代理的接口
  private Object target;

  public void setTarget(Object target) {
    this.target = target;
  }

  // 生产得到代理类
  public Object getProxy() {
    return Proxy.newProxyInstance(
        this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
  }

  //    处理按代理实例，并返回结果
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    log(method.getName());
    //      动态代理的本质，就是用反射机制实现
    Object result = method.invoke(target, args);
    return result;
  }

  public void log(String msg) {
    System.out.println("使用了" + msg + "方法");
  }
}
