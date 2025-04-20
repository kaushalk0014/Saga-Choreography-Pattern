package com.learning.payment.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.payment.entiry.UserTransaction;

@Repository
public interface UserTransactionRepositry extends JpaRepository<UserTransaction, Integer>{

}
