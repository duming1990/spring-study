package com.dm.config;

import com.dm.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 这个也会spring容器托管，注册到容器中，因为他本来就是一个@component
// @Configuration代表这是一个配置类，就和我们之前看的applicationContext.xml一样
@Configuration
@ComponentScan("com.dm.pojo")
@Import(MyConfig2.class)
public class MyConfig {

  @Bean
  public User user() {
    return new User();
  }
}
