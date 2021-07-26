package com.dm.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

// 方式三：使用该注解方式实现AOP
@Order(value = 1)
@Aspect // 标注这个类是个切面
public class AnnotationPoincut {
  @Pointcut("@annotation(Logging)")
  public void LoggingPoinCut() {
    // Method is empty as this is just a Pointcut, the implementations are in the advices.
  }

  //  @Before("execution(* com.dm.service.UserServiceImpl.*(..))")
  //  public void Before() {
  //    System.out.println("=========方法执行前=============");
  //  }
  //
  //  @After("execution(* com.dm.service.UserServiceImpl.*(..))")
  //  public void After() {
  //    System.out.println("=========方法执行后=============");
  //  }

  @Around(value = "LoggingPoinCut()")
  public void Around(ProceedingJoinPoint jp) throws Throwable {
    System.out.println("环绕前");

    Signature signature = jp.getSignature();
    System.out.println("=====signature======" + signature);
    // 执行方法
    jp.proceed();

    System.out.println("环绕后");
  }
}
