package com.learning.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.payment.entiry.Payment;
import com.learning.payment.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService service;
	
	
	@GetMapping("/payment/getById")
	public ResponseEntity<Payment>  getPayment(@RequestParam Integer paymentId){
		Payment payment=service.getPayment(paymentId);
		return new ResponseEntity<Payment>(payment, HttpStatus.OK);
	}
	
 
	
	@PostMapping("/payment/save")
	public ResponseEntity<Payment>  savePayment(@RequestBody Payment payment){
		payment=service.savePayment(payment);
		return new ResponseEntity<Payment>(payment, HttpStatus.OK);
	}
	
}
