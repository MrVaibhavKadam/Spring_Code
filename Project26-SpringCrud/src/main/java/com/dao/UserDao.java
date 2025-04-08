package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.User;

@Repository
public class UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void save(User user) {
//	        
		Session session = sessionFactory.getCurrentSession();
		session.save(user);

		System.out.println("User saved: " + user.getName());
	}

	public User getUserById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return ((UserDao) session).getUserById(id);
	}

}
