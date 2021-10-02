package com.example.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//問４－１ コントローラーを意味するアノテーションを記述
@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	//ユーザー情報一覧画面を表示
	@GetMapping("/customer_list")
	public String displayList(Model model) {
		List<Customer>customer_list = customerService.searchAll();
		model.addAllAttributes(customer_list);
		return "customer_list";
	}

	@PostMapping("")
	public String loginPost() {
		return "";
	}

	@GetMapping("")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}

	@RequestMapping("")
	public String top() {
		return "";
	}

}