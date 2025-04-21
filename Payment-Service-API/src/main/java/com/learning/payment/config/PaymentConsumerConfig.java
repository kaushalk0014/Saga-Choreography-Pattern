package com.learning.payment.config;

import java.util.function.Function;

import org.springframework.context.annotation.Configuration;

import com.learning.event.OrderEvent;
import com.learning.event.OrderStatus;
import com.learning.event.PaymentEvent;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Configuration
public class PaymentConsumerConfig {

	public Function<Flux<OrderEvent>, Flux<PaymentEvent>> paymentProcessor(){
		return orderEventFlux-> orderEventFlux.flatMap(this::processPayment);
	}
	
	public Mono<PaymentEvent> processPayment(OrderEvent event){
		//get the useId
		//check the balance availability 
		//if balance sufficient -> Payment completed and deduct amount from DB
		// if payment not sufficient -> cancel order event and update amount in db
		
		if(OrderStatus.ORDER_CREATED.equals(event.getOrderStatus())) {
				return Mono.fromSupplier(()->{
					
				});
		}	
		
	}
}
