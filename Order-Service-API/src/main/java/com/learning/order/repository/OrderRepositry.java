package com.learning.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.order.entiry.Order;

@Repository
public interface OrderRepositry extends JpaRepository<Order, Integer>{

}
