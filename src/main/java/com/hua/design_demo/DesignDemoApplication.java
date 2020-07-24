package com.hua.design_demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DesignDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignDemoApplication.class, args);
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }

}
