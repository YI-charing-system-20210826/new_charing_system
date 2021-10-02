package com.example.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements UserDetailsService {

	
	@Autowired
	private CustomerRepository customerRepository;

	private List<Customer> result;
	
	//全検索returnで検索結果
	public List<Customer> searchAll() {
		return customerRepository.findAll();
	}

	public List<Customer> findAllList() {
		result = customerRepository.findAll();
		return result;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}