package com.learning.payment.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
@ComponentScan(basePackages = {"com.learning.payment"})
public class PaymentServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApiApplication.class, args);
	}

}
