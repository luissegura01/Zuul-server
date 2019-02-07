package com.luis.microservice2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Microservice2Controller {
	
	@RequestMapping(value = "/students")
	public String greeting() {
		return "Hello from microservice2";
	}

}
