

package com.learning.event;

import java.util.Date;
import java.util.UUID;

import com.learning.dto.OrderRequestDTO;

public class OrderEvent implements Event{

	private UUID eventId=UUID.randomUUID();
	private Date eventDate=new Date();
	private OrderRequestDTO orderRequestDTO;
	private OrderStatus orderStatus;
	
	@Override
	public UUID getEventId() {
		return eventId;
	}
	
	@Override
	public Date getDate() {
		return eventDate;
	}
	
	public OrderEvent() {
	}

	public OrderEvent(OrderRequestDTO orderRequestDTO, OrderStatus orderStatus) {
		super();
		this.orderRequestDTO = orderRequestDTO;
		this.orderStatus = orderStatus;
	}
}
