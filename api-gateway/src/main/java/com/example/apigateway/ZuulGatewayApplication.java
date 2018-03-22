package com.example.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//@SpringBootApplication
@SpringBootApplication
@EnableZuulProxy
public class ZuulGatewayApplication {

//	// this is only for testing. It will be removed later
//	@RequestMapping("/")
//	public String home() {
//		return "some users";
//	}

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApplication.class, args);
	}
}