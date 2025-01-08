package com.vishal.exe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:module-deployment.properties")
@SpringBootApplication(scanBasePackages = "com.base.api.implemantations")
public class ExeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExeApplication.class, args);
    }
}