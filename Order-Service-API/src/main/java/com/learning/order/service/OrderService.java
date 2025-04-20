package com.learning.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.dto.OrderRequestDTO;
import com.learning.event.OrderStatus;
import com.learning.order.entiry.Order;
import com.learning.order.entiry.PurchaseOrder;
import com.learning.order.repository.OrderRepositry;
import com.learning.order.repository.PurchaseOrderRepositry;

@Service
public class OrderService {

	@Autowired
	private OrderRepositry repositry; 
	
	@Autowired
	private PurchaseOrderRepositry purchaseOrderRepositry;
	
	@Autowired
	private OrderServicePublisher publisher;
	
	public Order saveOrder(Order order) {
		return repositry.save(order);
	}

	public Order getOrderById(Integer id) {
		return repositry.findById(id).get();
	}

	@Transactional
	public PurchaseOrder createOrder(OrderRequestDTO dto) {
		PurchaseOrder order= purchaseOrderRepositry.save(converDtoToEntiry(dto));
		dto.setOrderId(order.getId());
		publisher.publisherOrderEvent(dto, OrderStatus.ORDER_CREATED);
		return order;
	}
	
	public List<PurchaseOrder> getAllOrders(){
		return purchaseOrderRepositry.findAll();
	}
	
	private PurchaseOrder converDtoToEntiry(OrderRequestDTO dto) {
		PurchaseOrder purchaseOrder=new PurchaseOrder();
		purchaseOrder.setProductId(dto.getProductId());
		purchaseOrder.setUserId(dto.getUserId());
		purchaseOrder.setOrderStatus(OrderStatus.ORDER_CREATED);
		purchaseOrder.setPrice(dto.getAmount());
		return purchaseOrder;
	}
	
	
}
