package com.learning.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.payment.entiry.Payment;
import com.learning.payment.repositry.PaymentRepositry;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepositry repositry;
	
	public Payment getPayment(Integer paymentId) {
		return repositry.findById(paymentId).get();
	}

	public Payment savePayment(Payment payment) {
		return repositry.save(payment);
	}

}
