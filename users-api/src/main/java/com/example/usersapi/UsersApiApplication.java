package com.example.usersapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class UsersApiApplication {

//	 this is only for testing. It will be removed later
	@RequestMapping("/")
	public String home() {
		return "some users";
	}

	public static void main(String[] args) {
		SpringApplication.run(UsersApiApplication.class, args);
	}

}

