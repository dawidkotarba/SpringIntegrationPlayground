package com.dawidkotarba.springIntegrationPlayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:integration.xml")
public class SpringIntegrationPlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationPlaygroundApplication.class, args);
	}
}
