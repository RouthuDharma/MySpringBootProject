package com.java.MySpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author RaviKumar Medi    on  28-11-2025
 *
 */

@SpringBootApplication(scanBasePackages = "com.java")
public class MySpringBootProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootProjectApplication.class, args);
	}
}

