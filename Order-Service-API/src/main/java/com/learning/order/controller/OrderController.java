package com.learning.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.order.entiry.Order;
import com.learning.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService service;
	
	@PostMapping("/order/save")
	public ResponseEntity<Order> saveOrder(@RequestBody Order order){
		order=service.saveOrder(order);
		return new ResponseEntity<Order>(order, HttpStatus.OK);
	}
	
	
	
	@GetMapping("/order/getById")
	public ResponseEntity<Order> getOrderById(@RequestParam Integer id){
		Order order=service.getOrderById(id);
		return new ResponseEntity<Order>(order, HttpStatus.OK);
	}
}
