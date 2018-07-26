package com.cg.walletApp.repo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.walletApp.beans.Customer;

//mobileNo is string
public interface WalletRepo extends JpaRepository<Customer, String>{

}
