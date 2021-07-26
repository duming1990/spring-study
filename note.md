##常用依赖
```xml
    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.10.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```
## 注解说明

- @Autowired
- @Nullable
- @Resource：自动装配通过名字，类型
- @component:组件，放在类上，说明这个类被spring管理了，就是bean！