package com.deepshikha.ISSDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
import org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication(exclude = {} )
@EnableCircuitBreaker
public class IssDemoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(IssDemoApplication.class, args);
	}

}
