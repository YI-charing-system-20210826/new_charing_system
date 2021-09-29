package com.example.customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Customer findByCustomer_id(String customer_id);
    public List<Customer> findAll();
	public Customer findByUsername(String customer_id);
}