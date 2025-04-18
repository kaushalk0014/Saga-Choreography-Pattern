package com.learning.event;

import java.util.Date;
import java.util.UUID;

import com.learning.dto.PaymentRequestDTO;

public class PaymentEvent implements Event{

	private UUID eventId=UUID.randomUUID();
	private Date dataDate=new Date();
	private PaymentRequestDTO paymentRequestDTO;
	
	private PaymentStatus paymentStatus;
	
	
	@Override
	public UUID getEventId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Date getDate() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
