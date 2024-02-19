package com.germie.fency.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.germie.fency.repositories")
@ComponentScan(basePackages = "com.germie.fency.controllers")
public class FencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FencyApplication.class, args);
	}

}
