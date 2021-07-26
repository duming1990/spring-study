package com.dm.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 等价于 <bean id="user" class="com.dm.pojo.User"/>
// @Component 组件
@Component
@Scope("singleton")
public class User {
  // 等价于 <property name="name" value="明神"/>
  @Value("明神")
  public String name;

  //  也可以注解在set方法上
  //  @Value("明神")
  public void setName(String name) {
    this.name = name;
  }
}
