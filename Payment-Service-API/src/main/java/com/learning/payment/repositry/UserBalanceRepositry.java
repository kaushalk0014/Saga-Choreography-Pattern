package com.learning.payment.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.payment.entiry.UserBalance;

@Repository
public interface UserBalanceRepositry  extends JpaRepository<UserBalance, Integer>{

}
