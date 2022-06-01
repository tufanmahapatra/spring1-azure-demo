package com.java.spring1azuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Spring1AzureDemoApplication {
	@GetMapping("/message")
	public String message(){
		return "congrats";
	}

	public static void main(String[] args) {
		SpringApplication.run(Spring1AzureDemoApplication.class, args);
	}

}
