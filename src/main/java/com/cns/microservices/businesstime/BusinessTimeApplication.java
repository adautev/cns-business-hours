package com.cns.microservices.businesstime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class BusinessTimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessTimeApplication.class, args);
	}
}
