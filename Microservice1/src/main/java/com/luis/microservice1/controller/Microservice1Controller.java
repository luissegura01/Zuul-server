package com.luis.microservice1.controller;

import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@EnableHystrix
public class Microservice1Controller {
	
	@RequestMapping(value = "/teachers")
	@HystrixCommand(fallbackMethod = "fallback_hello")
	public String greeting() throws InterruptedException {
		//Thread.sleep(3000);
		//return "Hello from microservice1";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject("http://localhost:8082/students", 
		          String.class);
		return "microservice1 calling microservice2, " + result;
	}
	
	private String fallback_hello() {
		   return "Request fails. Please try again later";
		}

}
