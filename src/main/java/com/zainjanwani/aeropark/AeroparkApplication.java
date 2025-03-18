package com.zainjanwani.aeropark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AeroparkApplication {
	public static void main(String[] args) {
		SpringApplication.run(AeroparkApplication.class, args);
	}
}