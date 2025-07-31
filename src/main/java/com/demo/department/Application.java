package com.demo.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Hello....Welcome in this application");
		SpringApplication.run(Application.class, args);
	}

}
