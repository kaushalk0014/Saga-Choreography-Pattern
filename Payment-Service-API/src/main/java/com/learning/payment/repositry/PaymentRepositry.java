package com.learning.payment.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.payment.entiry.Payment;

@Repository
public interface PaymentRepositry extends JpaRepository<Payment, Integer>{

}
