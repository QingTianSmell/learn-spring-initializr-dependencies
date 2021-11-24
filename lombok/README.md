## Lombok 模块

### 项目结构

```
├── root
│   ├── lombok/             使用 Lombok 写法
│   ├── original/           使用原生写法
│   └── LombokApplication   演示启动类
```

### Lombok 常用注解

- @Getter : 会自动生成 get... 方法
- @Setter : 会自动生成 set... 方法
- @ToString : 会自动生成 toString 方法
- @EqualsAndHashCode : 会自动生成 equals 和 hashCode 方法，包括所有非静态变量和非 transient 的变量。
- @NoArgsConstructor : 会自动生成空参构造函数
- @AllArgsConstructor : 会自动生成全参构造函数，很多地方（像是 Spring Data JPA），会需要每个类都一定要有一个无参数的构造器，所以在加上 @AllArgsConstructor 时，一定要补上 @NoArgsConstructor
- @RequiredArgsConstructor : 会自动生成必要参构造函数
- @Data : 整合注解 @Data = @Getter + @Setter + @ToString + @EqualsAndHashCode + @RequiredArgsConstructor
- @Value : 整合注解 @Value = @Getter + @ToString + @EqualsAndHashCode + @RequiredArgsConstructor
- @Builder : 自动生成 Builder 模式的方法。注意，虽然只要加上 @Builder 注解，我们就能够用流式写法快速设定对象的值，但是 setter 还是必须要写不能省略的，因为 Spring 或是其他框架有很多地方都会用到对象的 getter/setter 对他们取值/赋值。所以通常是 @Data 和 @Builder 会一起用在同个类上，既方便我们流式写代码，也方便框架做事。
- @Slf4j :  会自动生成该类的 log 静态常量
