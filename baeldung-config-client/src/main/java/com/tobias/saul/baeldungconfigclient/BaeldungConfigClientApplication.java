package com.tobias.saul.baeldungconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BaeldungConfigClientApplication {
	
	@Value("${user.role}")
	private String role;

	public static void main(String[] args) {
		SpringApplication.run(BaeldungConfigClientApplication.class, args);
	}
	
	@GetMapping("/whoami/{username}")
	public String getRole(@PathVariable("username") String username) {
		String message = "Hello " + username + " you are " + role;
		return message;
	}

}
