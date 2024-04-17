package com.springboot.learn.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogController {

    @GetMapping("/learnLog")
    public String learnLog() {
 /*       Logger logger = LoggerFactory.getLogger(getClass());

        logger.info("hello,log");*/

        for (int i = 0; i <1000 ; i++) {
            log.info("hello,log");
        }

        return "hello,log";
    }
}
