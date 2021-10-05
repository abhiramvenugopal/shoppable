package com.shoppable.api.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shoppable.api.entity.UserEntity;

@Repository(value = "loginDAO")
public class LoginDAOImpl implements LoginDAO{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public String authenticateCustomer() throws Exception {
		Query query = entityManager.createQuery("select u from UserEntity u");
		@SuppressWarnings("unchecked")
		List<UserEntity> userEntities = query.getResultList();
		if(userEntities.isEmpty())
			return null;

		return userEntities.get(0).getUsername();
	}

}
