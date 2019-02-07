package com.luis.microservice1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Microservice1Controller {
	
	@RequestMapping(value = "/teachers")
	public String greeting() {
		return "Hello from microservice1";
	}

}
