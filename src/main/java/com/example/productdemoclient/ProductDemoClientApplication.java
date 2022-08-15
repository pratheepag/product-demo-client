package com.example.productdemoclient;

import org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean;
import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductDemoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductDemoClientApplication.class, args);
	}
}
