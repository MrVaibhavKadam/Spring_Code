package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.User;
import com.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public User getUserById(int id) {
		return dao.getUserById(id);
	}

	@Transactional
	public void addUser(User user) {
		if (user.getName().isEmpty()) {

			throw new IllegalArgumentException("Please Enter valid name.");

		}

		dao.save(user);
	}

}
