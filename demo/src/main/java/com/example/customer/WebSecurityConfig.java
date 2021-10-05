package com.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 認可の設定
		http.authorizeRequests()
				.antMatchers("/loginForm").permitAll(); // --- (4) /loginFormは、全ユーザからのアクセスを許可
				
		// ログイン設定
		http.formLogin() // --- (6) フォーム認証の有効化
				.loginPage("/login") // --- (7) ログインフォームを表示するパス
				.loginProcessingUrl("authenticate") // --- (8) フォーム認証処理のパス
				.usernameParameter("userName") // --- (9) ユーザ名のリクエストパラメータ名
				.passwordParameter("password") // --- (10) パスワードのリクエストパラメータ名
				.defaultSuccessUrl("/customer_list") // --- (11) 認証成功時に遷移するデフォルトのパス
				.failureUrl("/login_"); // --- (12) 認証失敗時に遷移するパス

		// ログアウト設定
		http.logout()
				.logoutSuccessUrl("/login") // --- (13) ログアウト成功時に遷移するパス
				.permitAll(); // --- (14) 全ユーザに対してアクセスを許可
	}
}