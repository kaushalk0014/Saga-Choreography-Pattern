package com.learning.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.dto.OrderRequestDTO;
import com.learning.event.OrderEvent;
import com.learning.event.OrderStatus;

import reactor.core.publisher.Sinks;

@Service
public class OrderServicePublisher {

	@Autowired
	private Sinks.Many<OrderEvent> orderSinks;
	
	public void publisherOrderEvent(OrderRequestDTO dto, OrderStatus orderStatus) {
		OrderEvent orderEvent=new OrderEvent(dto, orderStatus);
		
	}
}
