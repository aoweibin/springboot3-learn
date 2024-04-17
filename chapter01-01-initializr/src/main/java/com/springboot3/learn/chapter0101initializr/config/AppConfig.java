package com.springboot3.learn.chapter0101initializr.config;

import com.springboot3.learn.chapter0101initializr.bean.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Configuration
/*
* @EnableConfigurationProperties(Sheep.class) 两个作用：
*   1.开启 Sheep.class 的配置属性绑定。注意：Sheep.class 还是需要标记 @ConfigurationProperties 注解
*   2.帮助注册 Sheep.class 注册到 Bean 容器中
*/
@EnableConfigurationProperties(Sheep.class)
public class AppConfig {

/*    @Bean
    @Scope("prototype")
    public Cat getCat(){
        Cat cat = new Cat();
        cat.setName("hello");
        return cat;
    }*/

    @ConditionalOnClass(name = "com.alibaba.druid.FastsqlException")
    @Bean
    public Cat cat01() {
        return new Cat();
    }

    @ConditionalOnMissingClass(value = "com.alibaba.druid.FastsqlException")
    @Bean
    public Dog dog01() {
        return new Dog();
    }

    @ConditionalOnBean(name = "dog01")
    @Bean
    public User zhangsan() {
        return new User();
    }

    @ConditionalOnMissingBean(name = "dog01")
    @Bean
    public User lisi() {
        return new User();
    }

    @Bean
    public Pig pig() {
        return new Pig();
    }
}
