package com.dashboard.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dashboard.dao.UserDao;
import com.dashboard.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

}

