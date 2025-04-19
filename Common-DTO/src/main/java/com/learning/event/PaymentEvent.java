package com.learning.event;

import java.util.Date;
import java.util.UUID;

import com.learning.dto.PaymentRequestDTO;

public class PaymentEvent implements Event{

	private UUID eventId=UUID.randomUUID();
	private Date eventDate=new Date();
	private PaymentRequestDTO paymentRequestDTO;
	private PaymentStatus paymentStatus;
	
	
	@Override
	public UUID getEventId() {
		return eventId;
	}
	@Override
	public Date getDate() {
		return eventDate;
	}
	
	public PaymentEvent() {
	}
	public PaymentEvent(PaymentRequestDTO paymentRequestDTO, PaymentStatus paymentStatus) {
		super();
		this.paymentRequestDTO = paymentRequestDTO;
		this.paymentStatus = paymentStatus;
	}
	
	
	
}
