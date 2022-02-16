package com.cts.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(value = "/")
	public String hi() {
		return "Welcome to the elasticbeantalk Home Page";
	}

}
