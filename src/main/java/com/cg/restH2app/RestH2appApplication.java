package com.cg.restH2app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cg.restH2app")
public class RestH2appApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestH2appApplication.class, args);
	}

}
