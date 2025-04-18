package com.learning.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.order.entiry.Order;
import com.learning.order.repository.OrderRepositry;

@Service
public class OrderService {

	@Autowired
	private OrderRepositry repositry; 
	
	public Order saveOrder(Order order) {
		return repositry.save(order);
	}

	public Order getOrderById(Integer id) {
		return repositry.findById(id).get();
	}

}
