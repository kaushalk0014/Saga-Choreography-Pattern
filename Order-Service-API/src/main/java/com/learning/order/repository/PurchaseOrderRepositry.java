package com.learning.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.order.entiry.PurchaseOrder;

@Repository
public interface PurchaseOrderRepositry extends JpaRepository<PurchaseOrder, Integer>{

}
