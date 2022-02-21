package com.logging.aop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringLoggingAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLoggingAopApplication.class, args);
	}
	


}
