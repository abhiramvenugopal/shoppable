package com.shoppable.api.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shoppable.api.dao.LoginDAO;

@Service( value = "loginService" )
@Transactional
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDAO loginDAO;

	@Override
	public String authenticateCustomer() throws Exception {
		return loginDAO.authenticateCustomer();
	}

}
