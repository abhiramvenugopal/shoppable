package com.shoppable.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppable.api.service.LoginService;

@CrossOrigin
@RestController
@RequestMapping("login")
public class LoginApi {
	@Autowired
	private LoginService loginService;
	
	@GetMapping(value="verify")
	public String login() throws Exception {
		return loginService.authenticateCustomer();
	}
}
