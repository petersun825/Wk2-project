package com.example.usersapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class UsersApiApplication {
	//this is only for testing.  It will be removed later.
	@RequestMapping("/")
	public String home () {
		return "some users";
	}

	public static void main(String[] args) {
		SpringApplication.run(UsersApiApplication.class, args);
	}
}