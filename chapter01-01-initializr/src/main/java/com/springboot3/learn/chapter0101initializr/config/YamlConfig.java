package com.springboot3.learn.chapter0101initializr.config;

import com.springboot3.learn.chapter0101initializr.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class YamlConfig {
    @Bean
    public Person getPerson() {
        return new Person();
    }
}
