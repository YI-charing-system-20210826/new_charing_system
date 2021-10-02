package com.example.customer;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Entity
@Data
@Table(name = "costomer")
public class Customer implements UserDetails {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(nullable = false, unique = true)
	private Long customer_id;

	@Column(nullable = false)
	private String last_name;

	@Column(nullable = false)
	private String first_name;

	@Column(nullable = false)
	private String last_name_Kana;

	@Column(nullable = false)
	private String first_name_Kana;

	@Column(nullable = false)
	private String gender;

	@Column(nullable = false)
	private String tel_no;

	@Column(nullable = true)
	private String email;

	@Column(nullable = false)
	private Long post_no;

	@Column(nullable = false)
	private String address;

	@Column(nullable = false)
	private String address_detail;

	@Column(nullable = true)
	private String remarks;

	protected Customer() {
	}

	public Customer(Long customer_id, String last_name, String first_name, String last_name_Kana, String first_name_Kana,
			String gender, String tel_no, String email, Long post_no, String address, String address_detail,
			String remarks) {

		this.customer_id = customer_id;
		this.last_name = last_name;
		this.first_name = first_name;
		this.last_name_Kana = last_name_Kana;
		this.first_name_Kana = first_name_Kana;
		this.gender = gender;
		this.tel_no = tel_no;
		this.email = email;
		this.post_no = post_no;
		this.address = address;
		this.address_detail = address_detail;
		this.remarks = remarks;

	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public String getPassword() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public String getUsername() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
}