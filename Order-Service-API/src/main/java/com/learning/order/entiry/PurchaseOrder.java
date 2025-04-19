package com.learning.order.entiry;

import com.learning.event.OrderStatus;
import com.learning.event.PaymentEvent;
import com.learning.event.PaymentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="purchase_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrder {

	private Integer id;
	private Integer userId;
	private Integer productId;
	private Integer price;
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;
	@Enumerated(EnumType.STRING)
	private PaymentStatus paymentStatus;
}
