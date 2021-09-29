package com.example.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements UserDetailsService {

	@Autowired
	private CustomerRepository repository;

	private List<Customer> result;

	@Override
	public Customer loadUserByUsername(String customer_id) throws UsernameNotFoundException {
		if (customer_id == null || "".equals(customer_id)) {
			throw new UsernameNotFoundException("Username is empty");
		}

		Customer user = repository.findByUsername(customer_id);
		if (user == null) {
			throw new UsernameNotFoundException("User not found: " + customer_id);
		}

		return user;
	}

	public List<Customer> findAllList() {
		result = repository.findAll();
		return result;
	}

}