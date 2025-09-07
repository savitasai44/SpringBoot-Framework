package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDatabaseConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDatabaseConnectionApplication.class, args);
		System.err.println("Application Started in DATABASE Connection.....");
	}

}
