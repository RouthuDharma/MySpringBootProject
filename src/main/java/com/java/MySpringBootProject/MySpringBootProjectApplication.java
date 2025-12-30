package com.java.MySpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.java")
@EntityScan(basePackages = "com.java.model")
@EnableJpaRepositories(basePackages = "com.java.repository")
@EnableScheduling
public class MySpringBootProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootProjectApplication.class, args);
    }
}
