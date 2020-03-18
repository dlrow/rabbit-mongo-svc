package com.aol.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.*")
@EnableMongoRepositories(basePackages ="com.aol")
@EnableSwagger2
public class AppMain {
        public static void main(String[] args) {
            SpringApplication.run(AppMain.class, args);

    }
}
