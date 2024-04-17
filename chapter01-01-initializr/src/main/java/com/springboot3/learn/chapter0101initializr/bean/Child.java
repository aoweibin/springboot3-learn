package com.springboot3.learn.chapter0101initializr.bean;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Child {
    private String name;
    private Integer age;
    private Date birthDay;
    private List<String> text; //数组
}