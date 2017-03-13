package com.profile.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TestbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestbackendApplication.class, args);
	}
}
