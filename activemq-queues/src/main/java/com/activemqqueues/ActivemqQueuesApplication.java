package com.activemqqueues;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.activemqqueues.*")
public class ActivemqQueuesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivemqQueuesApplication.class, args);
	}

}
