package com.example.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements UserDetailsService {

	@Autowired
	private AccountRepository repository;

	private List<Account> result;

	@Override
	public Account loadUserByUsername(String customer_id) throws UsernameNotFoundException {
		if (customer_id == null || "".equals(customer_id)) {
			throw new UsernameNotFoundException("Username is empty");
		}

		Account user = repository.findByUsername(customer_id);
		if (user == null) {
			throw new UsernameNotFoundException("User not found: " + customer_id);
		}

		return user;
	}

	public List<Account> findAllList() {
		result = repository.findAll();
		return result;
	}

}