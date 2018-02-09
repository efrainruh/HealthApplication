package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HealthApplication {
	
	 @GetMapping("/")
     String home() { 
         return "Hello world. This is a health application!";
     }


	public static void main(String[] args) {
		SpringApplication.run(HealthApplication.class, args);
	}
}
