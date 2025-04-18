package com.learning.dto;

import com.learning.event.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor	
public class OrderResponseDTO {


	private Integer userId;
	private Integer productId;
	private Integer orderId;
	private Integer amount;
	private OrderStatus orderStatus;

}
