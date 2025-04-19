package com.learning.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDTO {
	
	private Integer userId;
	private Integer productId;
	private Integer orderId;
	private Integer amount;
}
