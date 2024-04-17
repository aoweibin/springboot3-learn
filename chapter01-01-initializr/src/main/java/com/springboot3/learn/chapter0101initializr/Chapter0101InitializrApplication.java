package com.springboot3.learn.chapter0101initializr;

import com.springboot3.learn.chapter0101initializr.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Chapter0101InitializrApplication {
    public static void main(String[] args) {
        var ctx = SpringApplication.run(Chapter0101InitializrApplication.class, args);
//        for (String c : ctx.getBeanNamesForType(Cat.class)) {
//            System.out.println("cat-name：" + c);
//        }
//
//        for (String d : ctx.getBeanNamesForType(Dog.class)) {
//            System.out.println("dog-name：" + d);
//        }
//
//        for (String u : ctx.getBeanNamesForType(User.class)) {
//            System.out.println("user_name：" + u);
//        }

        var person = ctx.getBean(Person.class);
        System.out.println(person);

        List<String> lists = new ArrayList<>();

    }
}
