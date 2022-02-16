package com.cts.docker;

import javax.websocket.server.PathParam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "/docker")
public class DockerDemoApplication {
	@GetMapping(value = "/hello")
	public String hello() {
		return "Welcome to elasticbeantalk Project";
	}

	@PostMapping(value = "/welcome")
	public String welcome(@PathParam("uname") String uname, @PathParam("password") String password) {
		return "Welcome to elasticbeantalk Project with username: " + uname + " and password is " + password;
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

}
