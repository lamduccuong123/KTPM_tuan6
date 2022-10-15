package com.activemqtopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.activemqtopic.jms.JmsPublisher;
import com.activemqtopic.models.Company;
import com.activemqtopic.models.Product;

@SpringBootApplication
public class ActivemqTopicApplication implements CommandLineRunner{
	
	@Autowired
	JmsPublisher publisher;

	public static void main(String[] args) {
		SpringApplication.run(ActivemqTopicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Apple company & products
		 */
		// initial company and products
		Product iphone7 = new Product("Iphone 7");
		Product iPadPro = new Product("IPadPro");

		List<Product> appleProducts = new ArrayList<Product>(Arrays.asList(iphone7, iPadPro));

		Company apple = new Company("Apple", appleProducts);

		// send message to ActiveMQ
		publisher.send(apple);

	}
	

}
