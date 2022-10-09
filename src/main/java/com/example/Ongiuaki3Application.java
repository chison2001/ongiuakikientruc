package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Ongiuaki3Application {

	public static void main(String[] args) {
		SpringApplication.run(Ongiuaki3Application.class, args);
	}

}
