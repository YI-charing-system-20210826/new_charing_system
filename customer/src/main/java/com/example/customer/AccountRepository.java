package com.example.customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    public Account findByCustomer_id(String customer_id);
    public List<Account> findAll();
	public Account findByUsername(String customer_id);
}