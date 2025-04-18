package com.learning.order.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.learning.order"})
@EntityScan(basePackages = "com.learning.order.entiry")
@EnableJpaRepositories(basePackages = "com.learning.order.repository") 
public class OrderServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApiApplication.class, args);
	}

}
