package com.bridgelabz.com.citizenservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitizenServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitizenServiceApplication.class, args);
		System.out.println("Welcome to CitizenService Microservice Application");
	}

}