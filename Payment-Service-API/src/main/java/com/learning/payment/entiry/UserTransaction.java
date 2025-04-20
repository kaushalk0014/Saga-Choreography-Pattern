package com.learning.payment.entiry;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class UserTransaction {

	@Id
	private Integer orderId;
	private Integer userId;
	private Integer amount;
}
